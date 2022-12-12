package TareaTema3;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
  
        int n=5;

		char[][] tablero={ { ' ',' ', ' ', ' ',' '}, {' ',' ', ' ', ' ',' '} };

 

//rellenar la matriz

       for (int i=0; i<tablero.length;  i++){

           for(int j=0; j<tablero[i].length; j++){

               if (i==j){//las diagonales son aquellos valores en los que la i y la j coinciden

                   // por tanto le diremos que solo cuando no sean iguales.


                   tablero[i][j]='*';

               }

               } }

       //mostrar la matriz

        for (int i=0; i<tablero.length; i++){

                for (int j=0; j<tablero.length; j++){

               System.out.print ( tablero[i][j]+" ");

             }

                System.out.println();    //salto de linea

               }

        }

        }
