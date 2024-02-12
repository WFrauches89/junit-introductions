package org.meuscursos.junit;

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class GerenciadorBD {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorBD.class.getName());

    public static void iniciarConexa() {
        LOGGER.info("Iniciou conexao");
    }

    public static void finalcOnexao() {
        LOGGER.info("finalizando conexao...");
    }

    public static void inserirDadoPessoa(Pessoa pessoa) {
        LOGGER.info("inseriu dados");
    }
    public static void removerDadoPessoa(Pessoa pessoa) {
        LOGGER.info("removeu dados");
    }


}
