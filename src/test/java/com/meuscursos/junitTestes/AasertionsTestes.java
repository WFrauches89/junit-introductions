package com.meuscursos.junitTestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.meuscursos.junit.Pessoa;

import java.time.LocalDateTime;

public class AasertionsTestes {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10,20,30,40,50,60,70};
        int[] segundoLancamento = {10,5,6,90,-1,16};

        //Assertions.assertArrayEquals(primeiroLancamento,segundoLancamento);
        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
     }

     @Test
    void validarObjetoNull() {
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa("Pessoa test", LocalDateTime.of(2000,12,1,10,00));

        Assertions.assertNull(pessoa1);
     }

     @Test
     void validarNumerosTipos() {

        double valor = 5.0;
        int outroValor = 5;

        Assertions.assertEquals(valor, outroValor);
     }
}
