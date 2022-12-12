package TareaTema3;

import java.util.Scanner;

public class ejercicioArrays18_Mejorado {
//Programa mejorado en la forma de rellenado del array.
//Todo lo demás es igual al anterior, por eso hay menos comentarios.
	
	public static void main(String[] args) {
		int numeros[]=new int [10];//creo el array de tamaño 10  y tipo entero.
		Scanner sc = new Scanner(System.in);//función para sacar por pantalla.
		
		/*para llenar el Array con numeros de pantalla, primero recorro el array con for, luego 
		  pido el nº, pedirá un nº por cada posición, y por último asigno a cada posición el nº dado*/
		for (int i=0; i<numeros.length; i++) {
			System.out.print("Dame el nº de la posición "+ i +": ");
			numeros [i]=sc.nextInt();
		}//for
		
		int mayor=0;
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]>mayor) {
				mayor=numeros[i];
			}///if
		}//for
		
		int pos=0;
		for (int i=0; i<numeros.length; i++) {
			if (numeros[i]==mayor) {
				pos=i;
			}//if
		}//for

		System.out.println("El nº mayor es "+ mayor + " y está en la posición "+pos);

	}//main
}//class
