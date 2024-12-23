package com.coderhouse.Arrays;
import java.util.Arrays;


public class Ejer_Resueltos {
    public static void main(String[] args) {
        // Ejercicio 1
        int[] numeros = {10, 20, 30, 40, 50};
        mostrarArray(numeros);

        // Ejercicio 2
        sumarElementos(numeros);

        // Ejercicio 3
        encontrarMayor(numeros);

        // Ejercicio 4
        encontrarMenor(numeros);

        // Ejercicio 5
        contarPares(numeros);

        // Ejercicio 6
        invertirArray(numeros);

        // Ejercicio 7
        String[] cadenas = {"Hola", "Mundo", "Java", "Es", "Genial"};
        mostrarCadenas(cadenas);

        // Ejercicio 8
        ordenarArray(numeros);

        // Ejercicio 9
        buscarNumero(numeros, 30);

        // Ejercicio 10
        mostrarArrayInverso(numeros);
    }

    // Ejercicio 1: Mostrar los elementos de un array
    public static void mostrarArray(int[] array) {
        System.out.println("Elementos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": " + array[i]);
        }
    }

    // Ejercicio 2: Sumar los elementos de un array
    public static void sumarElementos(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

    // Ejercicio 3: Encontrar el número mayor
    public static void encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }

    // Ejercicio 4: Encontrar el número menor
    public static void encontrarMenor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("El número menor es: " + menor);
    }

    // Ejercicio 5: Contar números pares
    public static void contarPares(int[] array) {
        int pares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);
    }

    // Ejercicio 6: Invertir el array
    public static void invertirArray(int[] array) {
        System.out.println("Array invertido:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    // Ejercicio 7: Mostrar elementos de un array de cadenas
    public static void mostrarCadenas(String[] cadenas) {
        System.out.println("Elementos del array de cadenas:");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }

    // Ejercicio 8: Ordenar el array en orden ascendente
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array ordenado:");
        for (int num : array) {
            System.out.println(num);
        }
    }

    // Ejercicio 9: Buscar un número en el array
    public static void buscarNumero(int[] array, int buscar) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {
                System.out.println("Número " + buscar + " encontrado en el índice: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El número " + buscar + " no está en el array.");
        }
    }

    // Ejercicio 10: Mostrar los elementos del array en orden inverso
    public static void mostrarArrayInverso(int[] array) {
        System.out.println("Elementos del array en orden inverso:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
