package com.meuscursos.junitTestes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionalTest {

    @Test
    @EnabledIfEnvironmentVariable(named="USUARIO", matches = "BlessedKiller")
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @EnabledOnOs(value = OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_11)
    @EnabledForJreRange(min = JRE.JAVA_11, max= JRE.JAVA_17)
    void validarUserForTesting() {

        Assertions.assertEquals(10, 5 + 5);
    }

}
