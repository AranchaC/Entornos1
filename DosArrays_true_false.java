package TareaTema3;

import java.util.Arrays;

public class DosArrays_true_false {

	public static void main(String[] args) {
		//Primero, creo los dos arrays, en este caso los voy a crear diferentes, 
		//entonces el el programa tendrá que decir false.
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6 };
    	
        /*y en segundo lugar, comparo los dos arrays con la función equals,
        aprovechando el resultado de la comparación para crear variable booleana 
        para que el resultado sea true o false.*/
        boolean resultado = Arrays.equals(array1, array2);
        
        /*y por último, muestro el resultado de la comparación de los arrays,
        en este caso, muestro la variable booleana, cuyo resultado será true o false.*/
        System.out.println("Los dos Arrays son iguales: "+resultado);
        
        /*ALTERNATIVA:
        En lugar de crear boolean, se puede imprimir y comparar los arrays al mismo tiempo con:
        System.out.println(Arrays.equals(array1, array2));
        de esta manera, nos ahorramos un paso*/
    }//main
}//class
