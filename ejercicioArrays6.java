package TareaTema3;

import java.util.Arrays;//clase Arrays necesaria para luego usar los metodos de clase Arrays

public class ejercicioArrays6 {

	public static void main(String[] args) {
		
		//creo array/vector a la vez que asigno los valores.
		int vectornumeros []= {22,31,17,45,15,28};
		
		//Ordeno el array usando sort.
		Arrays.sort(vectornumeros);
		
		//Imprimo los valores usando toString.
		System.out.println("-Dime los valores del vector de menor a mayor: " + Arrays.toString(vectornumeros)+ ".");
		
		//Imprimo la dimensión:
		System.out.println("-Dime cuántas valores hay:  " + vectornumeros.length);
	
	}//main
}//class
