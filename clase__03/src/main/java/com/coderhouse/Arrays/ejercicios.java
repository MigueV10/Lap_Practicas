package com.coderhouse.Arrays;
import java.util.Arrays;

public class ejercicios {

	public static void main(String []args) {
		//ARRAYS
		//1.Crea un array de enteros de tamaño 5 y asigna valores a cada elemento.
		int[] numeros={10,34,50,67,34};
		//ejercicio3
		encontrarMayor(numeros);
		//Ejercicio4
		encontrarMenor(numeros);
		
		
		
		
//		//muestra el valor de cada indice 
//		for(int i=0; i < numeros.length; i++) {
//			System.out.println("Elemento indice " +i+":"+numeros[i]);
//		}
//		//los valores guardados en memoria. 
//		System.out.println("Los valores guardados en numeros son: " 
//		+numeros.length+ " numeros.");
//		//2. Suma todos los elementos de un array de enteros y muestra el resultado.
//		int suma = 0;
//		for(int i=0; i < numeros.length; i ++) {
//			suma+=numeros[i];
//			System.out.println("La suma de numeros es: " +suma[i]);
//		}
		
	}
	//3. Encuentra el número mayor en un array de enteros.
    public static void encontrarMayor(int[] array) {
        int mayor = array[0];
        for (int num : array) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
    //4. Encuentra el menor!
    public static void encontrarMenor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("El número menor es: " + menor);
    }
}
