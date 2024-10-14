package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    private Example example;
    @BeforeEach
    public void init(){
        this.example = new Example();
    }
    

    // 1. Método para sumar dos números
    @Test
    public void testSumar() {
        //Example example =  new Example(); crear el objecto example
        // Given - Teniendo
        int num1 = 35; // parametros
        int num2 = 79;

        // When - Cuando
        int result = example.sumar(num1, num2);

        // Then - Entonces
        assertEquals(114, result);
        assertTrue(result > 100);
        assertFalse(result > 120);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);

    }

    //2. Métodos que lanza una excepción si el argumento es negativo
    @Test
    public void testCheckPositivo() {
        int number = 5;
        boolean result = example.checkPositivo(number);
        assertTrue(result);
    }

    @Test
    public void testCheckPositiveError() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () ->{
            example.checkPositivo(number);

        });
    }

    // 3. Método para contar el número de letras 'a' en una cadena
    @Test
    public void testContarLetras() {
        String cadena = "cascada";
        int result = example.contarletrasA(cadena);
        assertEquals(3, result);
        assertNotNull(result);
    }

    //  4. Método que retorna un valor booleano si la lista contiene el elemento
    @Test
    public void testContieneElemento() {
        List<String> lista = Array.asList("dalia", "pensamiento", "clavel", "rosa");
        assertTrue(example.contieneElemento(lista, "dalia"));
        assertFalse(example.contieneElemento(lista, "tulipán"));
        List<String> listaVacia = Array.asList();
        assertFalse(example.contieneElemento(ListaVacia,"clavel"));

    }
    // 5.  5. Método para revertir una cadena
    @Test
    public void testRevertirCadena(){
        String cadena = "arenera";
        String result =example.revertirCadena(cadena);
        assertEquals("arenera",result);
        
    }




}
