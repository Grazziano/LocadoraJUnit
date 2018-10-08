package local.model;

import org.junit.Assert;
import org.junit.Test;

import javax.validation.Valid;
import static org.hamcrest.CoreMatchers.is;

public class FilmeTest {
<<<<<<< HEAD
    //TODO: Nome deve possuir entre 2 e 99 caracteres (inclusive)
    //Cenário
    
    //Processamento
     
    
    //TODO: Estoque não pode ser negativo, e o máximo é 99 (inclusive)
    //TODO: O preço de Locacao deverá ser um número positivo entre R$ 1,00 e R$ 9,99 (inclusive)
=======
    //TODO: Nome deve possuir entre 2 e 99 caracteres (inclusive) Lança FilmeException - O nome do filme deve possuir entre 2 e 99 caracteres

    //TODO: Estoque não pode ser negativo, e o máximo é 99 (inclusive) Lança FilmeException - Valor de estoque inválido
    //TODO: O preço de Locacao deverá ser um número positivo entre R$ 1,00 e R$ 9,99 (inclusive) Lança FilmeException - Valor locaçãa inválido
>>>>>>> d407e868636ca9a0f5e1b2f597fd2cf7b91a79a8



}
