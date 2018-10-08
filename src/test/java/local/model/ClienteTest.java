package local.model;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    //TODO: O nome não pode ser nulo. Lança RuntimeException -  Nome é um campo obrigatório
    //TODO: nome deve possuir entre 4 e 55 caracteres (inclusive). Lança ClienteException - O nome do cliente deve possuir entre 4 e 55 caracteres
    
    @Test
    public void deveAceitarNomeCom4Caracteres(){
        //cenário
        Cliente cliente = new Cliente();
        //Processamento e validação
        cliente.setNome("João");
        Assert.assertThat(cliente.getNome(), is("João"));
    }
    
    //TODO: O nome do cadastro deve possuir pelo menos 2 nomes (ex.: Angelo Luz)
    @Test
    public void deveAceitarDoisNomesNoCadastro(){
    //Cenário
    Cliente cliente = new Cliente(); 
    //Processamento
    cliente.setNome("Luiz Domingues");
    
    }
    
    //TODO: O nome deverá ser salvo sem espaços no início e fim
    //TODO: O nome não deverá possuir símbolo ou número.Lança ClienteException - Números e símbolos não são permitidos

}
