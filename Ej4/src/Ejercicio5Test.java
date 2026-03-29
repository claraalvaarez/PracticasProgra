import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ejercicio5Test {

    private Ejercicio5 ejercicio5;
    @Before
    public void setUp(){
        ejercicio5 = new Ejercicio5();
    }


    @Test
    public void testEdadMinimaPermitida(){
        assertTrue(ejercicio5.validarEdad(1));
    }

    @Test
    public void testEdadMinimaDenegada(){
        assertFalse(ejercicio5.validarEdad(0));
    }

    @Test
    public void testEdadMaximaPermitida(){
        assertTrue(ejercicio5.validarEdad(100));
    }

    @Test
    public void testEdadMaximaDenegada(){
        assertFalse(ejercicio5.validarEdad(101));
    }

    @Test
    public void testEdadNegativaDenegada(){
        assertFalse(ejercicio5.validarEdad(-1));
    }

    @Test
    public void testContraseñaValida(){
        assertTrue(ejercicio5.validarPassword("ABCDEFGHIj1"));
    }


    @Test
    public void testContraseñaNumCaracteresMaxNoValido(){
        assertFalse(ejercicio5.validarPassword("ABCDEFGHI"));
    }

    @Test
    public void testContraseñaLetraMin(){
        assertFalse(ejercicio5.validarPassword("ABCDEFGHI1J"));
    }

    @Test
    public void testContraseñaNumNoValido(){
        assertFalse(ejercicio5.validarPassword("ABCDEFGHIJ"));
    }

    @Test
    public void testContraseñaNoNula(){
        assertFalse(ejercicio5.validarPassword(""));
    }
    @Test
    public void testEmailValido(){
        assertTrue(ejercicio5.validarEmail("user@mail.com"));
    }

    @Test
    public void testEmailNulo(){
        assertFalse(ejercicio5.validarEmail(null));
    }

    @Test
    public void testEmailVacio(){
        assertFalse(ejercicio5.validarEmail(""));
    }

    @Test
    public void testEmailSinArroba(){
        assertFalse(ejercicio5.validarEmail("usermail.com"));
    }

    @Test
    public void testEmailSinPunto(){
        assertFalse(ejercicio5.validarEmail("user@mailcom"));
    }

    @Test
    public void testEmailPuntoAntesArroba(){
        assertFalse(ejercicio5.validarEmail("us.er@mailcom"));
    }

    @Test
    public void testEmailDemasiadoCorto(){
        assertFalse(ejercicio5.validarEmail("a@b."));
    }

}

