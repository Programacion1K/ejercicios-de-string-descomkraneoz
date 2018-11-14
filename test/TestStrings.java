import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStrings {

    @Test
    void testEspejo() {
        assertEquals(null, Espejo.espejoCadena(null), "Espejo falla al pasar un null");
        assertEquals("", Espejo.espejoCadena(""), "Espejo falla al pasar una cadena vacía");
        assertEquals("a", Espejo.espejoCadena("a"), "Espejo falla al pasar una cadena de longitud 1");
        assertEquals("121", Espejo.espejoCadena("12"), "Espejo falla al pasar una cadena de longitud 2");
        assertEquals("abcba", Espejo.espejoCadena("abc"), "Espejo falla abc");
    }

    @Test
    void testInversa() {
        assertEquals(null, Inversa.inversaCadena(null), "Inversa falla al pasar un null");
        assertEquals("", Inversa.inversaCadena(""), "Inversa falla al pasar una cadena vacía");
        assertEquals("a", Inversa.inversaCadena("a"), "Inversa falla al pasar una cadena de longitud 1");
        assertEquals("21", Inversa.inversaCadena("12"), "Inversa falla al pasar una cadena de longitud 2");
        assertEquals("bca", Inversa.inversaCadena("abc"), "Inversa falla abc");
    }

}
