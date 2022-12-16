package TareaTema3FIN;

import java.util.Random;
import java.util.Scanner;

public class matriz_pares_posición {

	public static void main(String[] args) {
		int pares [][]=new int[4][4];//creo matriz de tamaño 4x4
		int num;
		
		//recorro matriz para crear valores aleatorios con función random.
		for (int x=0; x < pares.length; x++) {
			for (int y=0; y < pares[x].length; y++) {
			   num=(int)(Math.random()*99+1);
			   //creo condición con IF y ELSE para que solo salgan números pares.
			   if (num%2==0) {
				   pares[x][y]=num;
			   }//if
			   else y--;
			}//for
		}//for
		//Recorro matriz y Muestro por pantalla la matriz creada con números aleatorios pares.
		for (int x=0; x < pares.length; x++) {
			for (int y=0; y < pares[x].length; y++) {
			    System.out.print ( pares[x][y]+"  " );
			 }//for
			System.out.println();
		}//for
		System.out.println();
		//Recorro matriz y Muestro por pantalla cada posición con su contenido.
		for (int x=0; x < pares.length; x++) {
			for (int y=0; y < pares[x].length; y++) {
				System.out.println("Posición "+x+","+y+" tiene el nº: "+pares[x][y]);
			}//for
		}//for
		
	}//main
}//class