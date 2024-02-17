package org.example;

import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear una matriz con números aleatorios
        int vendedores = 5;
        int meses = 12;
        int[][] ventas = new int[vendedores][meses];
        Random rand = new Random();
        for (int i = 0; i < vendedores; i++) {
            for (int j = 0; j < meses; j++) {
                ventas[i][j] = rand.nextInt(100); // Genera un número aleatorio entre 0 y 99
            }
        }

        // Imprimir la matriz por filas usando forEach
        Arrays.stream(ventas).forEach(fila -> { // Convierte la matriz en un stream de arrays
            Arrays.stream(fila).forEach(venta -> System.out.print(venta + " ")); // Convierte cada fila en un stream y lo imprime
            System.out.println(); // Imprime una nueva línea al final de cada fila
        });

        // Ordenar los elementos de una matriz por columna
        for (int j = 0; j < meses; j++) {
            int[] columna = new int[vendedores];
            for (int i = 0; i < vendedores; i++) {
                columna[i] = ventas[i][j]; // Recoge los valores de cada columna en un array
            }
            Arrays.sort(columna); // Ordena el array de la columna
            for (int i = 0; i < vendedores; i++) {
                ventas[i][j] = columna[i]; // Asigna los valores ordenados de nuevo a la columna correspondiente en la matriz
            }
        }
    }
}