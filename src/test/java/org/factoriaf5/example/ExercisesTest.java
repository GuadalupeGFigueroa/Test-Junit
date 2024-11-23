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
//Creamos una clase privada, llamada Exercises. Al ser una clase privada solo se puede emplear dentro de la clase padre ExercisesTest.

public ExercisesTest(){

}
    @BeforeEach
    //Estamos indicando que antes de cada uno de los test, tenga en cuenta esta instrucción.
    public void init(){
        this.exercises = new Exercises();
    }
    
    @Test
    // 1. Test método Sumar 1. Comprueba si se suman 2 números correctamente
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
   //Test método 2. Comprueba que el valor devuelto sea un número positivo
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
        /*el operador -> representa una expresión lambda. 
        En este caso específico, se utiliza para pasar un bloque de código como argumento al método assertThrows.
        (): Indica que no se reciben parámetros en la lambda.
        ->: Separa los parámetros de la implementación del cuerpo de la lambda.
        { ... }: El bloque de código que se ejecutará. Aquí, se llama al método checkPositive(number)
        */
    
    @Test
    //Test método 3. Contar letras "a" de un string
    public void testContarLetrasA() {
        String cadena = "migataesmuybonita";
        int result =exercises.contarLetrasA(cadena);
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    //Test método 3 que comprueba que en el caso de no haber letra A el resultado sea 0
    public void testContarLetrasASinA(){
        String cadena = "miperroquierecomer";
        int result = this.exercises.contarLetrasA(cadena);
        assertEquals(0, result);
    }
    @Test
    //Test método 3 para el caso que el valor esté vacío
    public void testContarLetrasAEmpty() {
        String cadena = "";
        int result = this.exercises.contarLetrasA(cadena);
        assertEquals(0, result);
    }

    @Test
    // Test del método 4. Retorna un valor booleano si la lista contiene el elemento
    public void testContieneElemento() {
        List<String> countries = List.of("Colombia", "México", "Perú", "España");
        String country = "España";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertTrue(result);
    }

    @Test
    //Comprobamos un elemento que no está presente en la lista
    public void testContieneElementoNoExiste() {
        List<String> countries = List.of("Colombia", "México", "Perú", "España");
        String country = "Holanda";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertFalse(result);
    }

    @Test
    //Comprobamos un elemento cuando la lista está vacía
    public void testContieneElementoListaVacia() {
        List<String> countries = Collections.emptyList();
        String country = "México";
        boolean result = this.exercises.contieneElemento(countries, country);
        assertFalse(result);
    }
    @Test
    //Test método 5. Revertir cadena
    public void testRevertirCadena() {
        String cadena = "casa";
        String result = this.exercises.revertirCadena(cadena);
        assertEquals("asac", result);
    }
    @Test
    //Test método 6. Comprobamos si el valor devuelto corresponde al factorial de 5.
    //Valor factorial de 5: 5!=5*4*3*2*1= 120
    public void testFactorial() {
        int number = 5;
        long result = this.exercises.factorial(number);
        assertEquals(120, result);
    }

    @Test
    //Test método 6. Comprobamos que el valor introducido sea un número positivo.
   public void testFactorialError() {
        int number = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            this.exercises.factorial(number);

        });
    }

    @Test
    // Test método 7. Números primos
    public void testEsPrimo() {
        int number = 7;
        boolean result = this.exercises.esPrimo(number);
        assertTrue(result);
    }


    @Test
    public void testNoEsPrimo() {
    // Números no primos
        int number = 8;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(8));
    }

    @Test
    // Casos especiales
    public void testNumeroNegativo() {
        int number = -10;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(-10)); // No es primo
    }

    @Test
    // Casos especiales
    public void testNumeroCero() {
        int number = 0;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(0)); // No es primo
    }

    @Test
    // Casos especiales
    public void testNumeroUno() {
        int number = 1;
        boolean result = this.exercises.esPrimo(number);
        assertFalse(this.exercises.esPrimo(1)); // No es primo
    }

    
    /*  Testeo del método 8 que simula un retraso y retorna un mensaje. 
        Como el método consta de 2 partes, por un lado que lance una excepción y por otra que el valor del retraso sea de 5000,
        haremos el testeo de ambas partes */
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        String result = this.exercises.mensajeConRetraso();
        assertEquals("Listo después de retraso", result);
    
    }
    /* InterruptedException :
        Si la otra tarea está activa, lo único que pasa es que se marca el flag de interrupción.

Pero si la otra tarea está bloqueada esperando a que ocurra algo, en lugar de marcar el flag, se le lanza una InterruptedException. 
El efecto es que la tarea se despierta y sabe que es porque la ha interrumpido otra.

Si no hacemos nada, la interrupción se limita a despertar a la tarea.

A veces lo que se hace es aprovechar el manejador para activar el flag y centralizar en otro sitio el manejo de la interrupción:

try {

...;

} catch (InterruptedException e) {

interrupt();

}         */

    @Test
    public void testMensajeConRetrasoInterrumpido() {
        Thread.currentThread().interrupt(); // Thread.currentThread: Obtiene el subproceso actualmente en ejecución.
        assertThrows(InterruptedException.class,() -> {
            this.exercises.mensajeConRetraso();
        });
        Thread.interrupted();
    }

    @Test
    //Test método 9
    public void testConvertirAString() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> result = this.exercises.convertirAString(numbers);
        assertEquals(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), result);
        
    }

    @Test
    //Test método 10
    public void testCalcularMedia() {
        List<Integer> numbers = List.of(1, 2, 3);
        double result = this.exercises.calcularMedia(numbers);
        assertEquals( 2, result);
    
    }

    @Test
    //Testeamos el caso en el que el valor sea nulo, por ejemplo que no sea entero
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
        List<String> lista = List.of("Calle", "María", "Josefa", "27");
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("Calle, María, Josefa, 27", result);

    }

    @Test
    public void testConvertirListaAStringNull() {
        List<String> lista = new ArrayList();
        lista.add("Hola");
        lista.add(null);
        lista.add("F5");
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("Hola,NULL,F5", result);

    }

    @Test
    public void testConvertirListaAStringEmpty() {
        List<String> lista = Collections.emptyList();
        String result = this.exercises.convertirListaAString(lista);
        assertEquals("", result);

    }

    
}
