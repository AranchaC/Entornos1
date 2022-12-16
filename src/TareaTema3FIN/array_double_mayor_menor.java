package TareaTema3FIN;

public class array_double_mayor_menor {

	public static void main(String[] args) {
		double numreales []= {12.23, 5.14, 23.7, 8.12, 30.3} ;//creo array tipo double
		//Primero muestro el array desordenado, llamando al método mostrar creado debajo.
		System.out.println("Array desordenado: ");
		mostrarArray(numreales);
		//Y ahora muestro el array ordenado, llamando al método burbuja creado debajo.
		System.out.println("Array ordenado de > a < con método burbuja: ");
		burbuja(numreales);
	}//main
	//Creo método para ordenar array con algoritmo burbuja.	
	static void burbuja(double numreales[]) {
		//Doble bucle for desde posición 0 hasta la última.
		for (int i=0; i<numreales.length;i++) {
			for (int j=1; j<numreales.length-i;j++) {
				/*Comparo elementos con IF, en nuestro caso, si el nº de la primera posición es 
				menor, entonces se intercambia, y así hacemos con cada posición, hasta llegar a la última,
				y de esta manera el array quedará ordenado de mayor a menor.
				Para ello hemos creado nueva variable con valor 0.*/
				if (numreales[j-1] < numreales[j]) {
					double newpos=0;
					newpos=numreales[j-1];
					numreales[j-1]=numreales[j];
					numreales[j]=newpos;
				}//if
			}//for
		}//for
		//Llamo al método para mostrar, creado a continuación.
		mostrarArray(numreales);
	}//burbuja
	//Creo método para mostrar array.
	static void mostrarArray(double numreales[]) {
		//Reorro array y muestro en pantalla.
		for (int i=0; i<numreales.length;i++) {
			System.out.println(numreales[i]);
		}//for
	}//mostrarArray					
}//class