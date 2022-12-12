package TareaTema3;

public class ejercicioArrays15 {
//Fácil después de hacer el ej 18, pues en ese ya hice este programa.
//Por lo que en el ej 18 hay una explicación más extendida.
	
	public static void main(String[] args) {
		int vector []= {1,58,74,2,12,20};//creo array
		
		/*Primero: función para sacar el nº mayor: recorrido, for e if*/	
		int mayor=0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]>mayor) {
				mayor=vector[i];
			}///if
		}//for
		
		/*Segundo: función para sacar la posición: recorrido, for e if*/
		int pos=0;
		for (int i=0; i<vector.length; i++) {
			if (vector[i]==mayor) {
				pos=i;
			}//if
		}//for
		
		System.out.println("El nº más grande es "+mayor+" y está en la posición "+pos);
	}//main
}//class
