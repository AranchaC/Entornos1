package TareaTema3;

import java.util.Scanner;
 
public class X_Con_Asteriscos_Mejorado {
	
	// comentario2 entornos p311//
	//COMENTARIO ENTORNOS P31//
 
public static void main(String[] args) {
		//pedimos por pantalla un nº impar, pues para tener un centro que conecten las dos
		//diagonales, debe ser de tamaño impar.
		System.out.print("Dame un nº impar: ");
		Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();         
        char xasteriscos [][]= new char [n][n];
        
        /*llenar matriz con espacios, con un doble bucle  FOR: uno para 
        las filas con la variable f y otro para las columnas con la variable c.*/   
        for (int f=0; f<n; f++) {
        	for (int c=0; c<n; c++) {
        		xasteriscos[f][c]= ' ';			
			}//for
        }//for
        
        //Rellenamos ambas diagonales, Primero recorro matriz hasta la última posición (sea cual sea).
        for (int i=0; i<xasteriscos.length; i++){
            for(int j=0; j<xasteriscos[i].length; j++){
            	//DIAGONAL PRINCIPAL: Tras plantearlo en papel, sabemos que es cuando las posiciones de 
            	//ambos arrays, i/j, coinciden, por lo que decimos que si i es igual a j, imprimimos el "*".
                if (i==j){
                    xasteriscos[i][j]='*';
                }//if
                //DIAGONAL SECUNDARIA: sabemos que va desde la posición 0/length hasta la posición length/0,
                //por lo que también con un if, comparamos en este caso las posiciones de los arrays, i/j, con
                //la última posición menos uno e imprimimos "*".
                if (i+j==xasteriscos.length-1) {
                	xasteriscos[i][j]='*';
                }//if
            }//for
        }//for        
        
        //visualizamos la matriz/tabla. 1ro se recorre y luego visualizamos.
        for (int i=0; i<xasteriscos.length; i++) {
        	System.out.println(xasteriscos[i]);
        }//for
        
    }//main
}//class