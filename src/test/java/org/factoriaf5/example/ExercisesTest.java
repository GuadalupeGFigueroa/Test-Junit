package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    // 1. Test método 1/2. Comprueba si se suman 2 números correctamente
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
   //Test método 2/2. Comprueba que el valor devuelto sea un número positivo
    public void testCheckPositivo() {
        int number = 5;
        boolean result = this.exercises.checkPositivo(number);
        Assertions.assertTrue(result);
    }

    @Test
    public void testCheckPositivoError() {
        int number = - 5;
        assertThrows(IllegalArgumentException.class, () -> {
            exercises.checkPositive(number);
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
    void testCalcularMedia() {
    

    }

    

    @Test
    void testConvertirAString() {

    }

    @Test
    void testConvertirListaAString() {

    }

    @Test
    void testEsPrimo() {

    }

    @Test
    void testFactorial() {

    }

    @Test
    void testMensajeConRetraso() {

    }

    @Test
    void testRevertirCadena() {

    }

    
}
