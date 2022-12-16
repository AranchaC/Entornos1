package TareaTema3Final;

import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares [][]=new int[4][4];
		int num;
		
		for (int x=0; x < pares.length; x++) {
			for (int y=0; y < pares[x].length; y++) {
			   num=(int)(Math.random()*99+1);
			   if (num%2==0) {
				   pares[x][y]=num;
			 }//if
			   else y--;
		}//for
		}//for
		for (int x=0; x < pares.length; x++) {
			for (int y=0; y < pares[x].length; y++) {
			    System.out.print ( pares[x][y]+", " );
			 }//for
			System.out.println();
		}//for
		System.out.println();
		
	}//main
}//class
			
		

