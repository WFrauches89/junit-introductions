package com.meuscursos.junitTestes;

import org.junit.jupiter.api.*;
import org.meuscursos.junit.GerenciadorBD;
import org.meuscursos.junit.Pessoa;

import java.time.LocalDateTime;

public class ConsultaDadosPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorBD.iniciarConexa();
    }

    @BeforeEach
    void insereDadosTest() {
        GerenciadorBD.inserirDadoPessoa(new Pessoa("João", LocalDateTime.of(2000,1,1,15,0,0)));
    }

    @AfterEach
    void removeDadosTest() {
        GerenciadorBD.removerDadoPessoa(new Pessoa("João", LocalDateTime.of(2000,1,1,15,0,0)));
    }

    @Test
    void validarDados() {
        Assertions.assertTrue(true);
        System.out.println("Feito o teste...");
    }
    @Test
    void validarDados2() {
        Assertions.assertTrue(true);
        System.out.println("Feito o teste 2...");
    }


    @AfterAll
    static void finalizaConexao() {
        GerenciadorBD.finalcOnexao();

    }


}
