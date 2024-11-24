package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExercisesTest {
private Exercises exercises; 

public ExercisesTest(){

}
    @BeforeEach
    public void init(){
        this.exercises = new Exercises();
    }
    
    @Test

   public void testSumar() {
      int num1 = 35;
      int num2 = 79;
      int result = this.exercises.sumar(num1, num2);
      Assertions.assertEquals(114, result);
      Assertions.assertTrue(result > 100);
      Assertions.assertFalse(result > 120);
      Assertions.assertNotNull(result);
      Assertions.assertInstanceOf(Integer.class, result);
   }
   
   @Test 

    public void testCheckPositivo() {
        int number = 5;
        boolean result = this.exercises.checkPositivo(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        int number = - 5;
        assertThrows(IllegalArgumentException.class, () -> {
            exercises.checkPositivo(number);
        });
    }
       
    
    @Test
    
    public void testContarLetrasA() {
        String cadena = "migataesmuybonita";
        int result =exercises.contarLetrasA(cadena);
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    
    public void testContarLetrasASinA(){
        String cadena = "miperroquierecomer";
        int result = this.exercises.contarLetrasA(cadena);
        assertEquals(0, result);
    }
    @Test
    
    public void testContarLetrasAEmpty() {
        String cadena = "";
        int result = this.exercises.contarLetrasA(cadena);
        assertEquals(0, result);
    }

    @Test
   
    public void testContieneElemento() {
        List<String> countries = List.of("Colombia", "México", "Perú", "España");
        String country = "España";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertTrue(result);
    }

    @Test
    
    public void testContieneElementoNoExiste() {
        List<String> countries = List.of("Colombia", "México", "Perú", "España");
        String country = "Holanda";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertFalse(result);
    }

    
    @Test

    public void testContieneElementoListaVacia() {
        List<String> countries = Collections.emptyList();
        String country = "México";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertFalse(result);
    }

    @Test

    public void testRevertirCadena() {
        String cadena = "casa";
        String result = this.exercises.revertirCadena(cadena);
        assertEquals("asac", result);
    }

    @Test
    
    public void testFactorial() {
        int number = 5;
        long result = this.exercises.factorial(number);
        assertEquals(120, result);
    }

    @Test
    
   public void testFactorialError() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            this.exercises.factorial(number);

        });
    }

    @Test
   
    public void testEsPrimo() {
        int number = 7;
        boolean result = this.exercises.esPrimo(number);
        assertTrue(result);
    }


    @Test
    public void testNoEsPrimo() {
   
        int number = 8;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(8));
    }

    @Test
   
    public void testNumeroNegativo() {
        int number = -10;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(-10)); 
    }

    @Test
  
    public void testNumeroCero() {
        int number = 0;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(0)); 
    }

    @Test
    // Casos especiales
    public void testNumeroUno() {
        int number = 1;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(1)); 
    }

    
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        String result = this.exercises.mensajeConRetraso();
        assertEquals("Listo después de retraso", result);
    
    }
    

    @Test
    public void testMensajeConRetrasoInterrumpido() {
        Thread.currentThread().interrupt(); // Thread.currentThread: Obtiene el subproceso actualmente en ejecución.
        assertThrows(InterruptedException.class,() -> {
            this.exercises.mensajeConRetraso();
        });
        Thread.interrupted();
    }

    @Test
   
    public void testConvertirAString() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> result = this.exercises.convertirAString(numbers);
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
        
    }

    @Test
  
    public void testCalcularMedia() {
        List<Integer> numbers = List.of(1, 2, 3);
        double result = this.exercises.calcularMedia(numbers);
        assertEquals( 2, result);
    
    }

    @Test
   
    public void testCalcularMediaNull() { 
        List<Integer> numbers = null;
        assertThrows(IllegalArgumentException.class,() -> {
            this.exercises.calcularMedia(numbers);
        });
    }
    
    @Test 
    public void testCalcularMediaEmpty(){
        List<Integer> numbers = Collections.emptyList();
        assertThrows(IllegalArgumentException.class, () -> {
            this.exercises.calcularMedia(numbers);
        });
    }
      
    @Test
    public void testConvertirListaAString() {
        List<String> lista = List.of("Calle", "Maria", "Josefa", "27");
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("CALLE,MARIA,JOSEFA,27", result);

    }

    @Test
    public void testConvertirListaAStringNull() {
        List<String> lista = new ArrayList();
        lista.add("Hola");
        lista.add(null);
        lista.add("F5");
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("HOLA,NULL,F5", result);

    }

    @Test
    public void testConvertirListaAStringEmpty() {
        List<String> lista = Collections.emptyList();
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("", result);

    }

    
}
