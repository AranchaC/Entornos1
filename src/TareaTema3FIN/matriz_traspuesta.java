package TareaTema3FIN;

public class matriz_traspuesta {

	public static void main(String[] args) {
		
		
		//CAMBIO PARA ENTORNOS
		
		//Después de hacer planteamiento en papel, puedo realizar el programa
		//Creo 1ra matriz y asigno valores a la vez, cada rango es una fila.
		int[][] matriz1 = {{1,2,3},{4,5,6},{7,8,9}};
		/*Como sabemos que las filas tendrán los valores de las columnas de la matriz1,
		y las columnas tendrán los valores de las filas de la matriz1, creo la 2da matriz
		usando atributo length de la 1ra matriz*/
		int[][] matriz2 = new int[matriz1[0].length][matriz1.length];
		
		 /*Usamos doble bucle FOR para poder recorrer la matriz1 y mostrarla*/
		System.out.println("Matriz 1: ");
		for (int f=0; f < matriz1.length; f++) {
			for (int c=0; c < matriz1[f].length; c++) {	
				System.out.print ( matriz1[f][c]+"  " );
			}//for
			System.out.println();
		}//for
		System.out.println();
		
		/*Recorro Matriz1 para cambiar valores y asignarlos a la matriz2:
		filas por columnas y mostrar matriz2*/
		System.out.println("Matriz 2 (traspuesta de Matriz 1):");
		for (int f=0; f < matriz1.length; f++) {
			for (int c=0; c < matriz1[f].length; c++) {	
				matriz2[c][f] = matriz1[f][c];
				System.out.print(matriz1[c][f] + "  ");
			}//for
			System.out.println();
		}//for		
		
	}//main
}//class
