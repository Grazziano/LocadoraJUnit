package local.service;

import java.util.Calendar;
import static local.util.DataUtils.adicionarDias;

import java.util.Date;
import java.util.List;

import local.model.Filme;
import local.model.Locacao;
import local.model.Cliente;
import local.exception.FilmeSemEstoqueException;
import local.exception.LocadoraException;
import local.util.DataUtils;

public class LocacaoService {
    double acumulador = 0;
    int acc = 0;
//TODO atualizar para muitos filmes
    public Locacao alugarFilme(Cliente cliente, List<Filme> filmes) throws FilmeSemEstoqueException, LocadoraException {
        if (cliente == null) {
            throw new LocadoraException("Impossível locar sem um usuário");
        }

        if (filmes == null || filmes.isEmpty()) {
            throw new LocadoraException("Nenhum filme foi selecionado");
        }

        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        
        for(Filme filme: filmes) {
            if (filme.getEstoque() == 0) {
                throw new FilmeSemEstoqueException("Filme sem estoque");
            }

            locacao.addFilme(filme);
         
            locacao.setDataLocacao(new Date());
            locacao.setValor(filme.getPrecoLocacao());
            
            
            //Entrega no dia seguinte
            Date dataEntrega = new Date();
            dataEntrega = adicionarDias(dataEntrega, 1);
            if(DataUtils.verificarDiaSemana(dataEntrega, Calendar.SATURDAY)){
                dataEntrega = adicionarDias(dataEntrega, 2);
                locacao.setDataRetorno(dataEntrega);
            }else{
            locacao.setDataRetorno(dataEntrega);}
            acc ++;
            switch(acc){
                case 1:
                    acumulador = acumulador + filme.getPrecoLocacao();
                    break;
                case 2:
                    acumulador = acumulador + filme.getPrecoLocacao();
                    break;
                case 3:
                    acumulador = acumulador + (filme.getPrecoLocacao() * 0.75);
                    break;
                case 4:
                    acumulador = acumulador + (filme.getPrecoLocacao() * 0.5);
                    break;
                case 5:
                    acumulador = acumulador + (filme.getPrecoLocacao() * 0);
                    break;
                    
            }
        }
        locacao.setValor(acumulador);
       
        //Salvando a locacao...	
        //TODO adicionar método para salvar
        return locacao;
    }
}
