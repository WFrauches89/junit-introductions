package com.meuscursos.junitTestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.meuscursos.junit.Conta;
import org.meuscursos.junit.TransferenciaContas;

public class ExceptionsTests {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaContas transferenciaContas = new TransferenciaContas();


        Assertions.assertThrows(IllegalArgumentException.class, () ->transferenciaContas.transfere(contaOrigem, contaDestino, -1) );

        Assertions.assertDoesNotThrow(() -> transferenciaContas.transfere(contaOrigem, contaDestino, 20));
    }



}
