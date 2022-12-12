package TareaTema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioArrays18_alternativa {
	/*He puesto esta alternativa al ejercicio que considero más sencilla y rápida. 
	 * aquí primero ordeno el array para saber directamente que el nº mayor está en la
	 * úlima posición. Usando métodos de la clase Arrays */

	public static void main(String[] args) {
		int numeros[]=new int [10];//creo el array de tamaño 10 y tipo entero.
		Scanner sc = new Scanner(System.in);//función para sacar por pantalla.
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Dame el nº de la posición "+ i +": ");
			numeros [i]=sc.nextInt();
		}//for
		
		Arrays.sort(numeros);//Variable para ordenar el array de forma ascendente.
		//Muestro en pantalla el contenido del array, ahora ordenado.
		System.out.println("Muestra los números ordenados de < a >: " + Arrays.toString(numeros));
		
		int mayor=0;
		for (int i=0; i<numeros.length; i++) {
				mayor=numeros[i];			
		}//for	
		
		System.out.println("Dime el nº mayor: "+ mayor);//Imprimo  el nº mayor.
		
		//Imprimo y busco la posición del numero mayor usando binarySearch.
		System.out.println("El nº mayor está en la posición: "+Arrays.binarySearch(numeros, mayor));

	}//main
}//class