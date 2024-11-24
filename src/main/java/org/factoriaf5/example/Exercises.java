package org.factoriaf5.example;

import java.util.List;
import java.util.stream.Collectors;

public class Exercises {
 
    public int sumar(int a, int b) {
        return a + b;
    }


    public boolean checkPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        return true;
    }


    public int contarLetrasA(String cadena) {
        return (int) cadena.chars()
                .filter(letra -> letra == 'a')
                .count();
    }


    public boolean contieneElemento(List<String> lista, String elemento) {
        return lista.contains(elemento);
    }

    
    public String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    o
    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial no definido para números negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

    
    public List<String> convertirAString(List<Integer> lista) {
        return lista.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

   
    public double calcularMedia(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vacía");
        }
        return lista.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

   
    public String convertirListaAString(List<String> lista) {
        return lista.stream()
        .map(s -> s == null ? "NULL" : s.toUpperCase()) 
        .collect(Collectors.joining(","));
    } 
}
