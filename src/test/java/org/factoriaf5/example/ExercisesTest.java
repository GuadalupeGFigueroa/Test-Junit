package org.factoriaf5.example;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
    void testCheckPositivo() {
        int number = 5;
        boolean result = this.exercises.checkPositivo(number);
        Assertions.assertTrue(result);
    }

    @Test
    void testCheckPositivoError() {
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
    void testCalcularMedia() {

    }

 
    @Test
    void testContarLetrasA() {

    }

    @Test
    void testContieneElemento() {

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
