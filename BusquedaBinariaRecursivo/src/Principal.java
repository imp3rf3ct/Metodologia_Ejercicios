import java.util.Scanner;
import utilities.Util;

public class Principal {
	public static void main(String [] args){
		Util ut = new Util();
		Scanner scan = new Scanner(System.in);
		Comparable [] VectorOrdenado = {1,3,5,7,15,22,40,65};
		int elemento,posicion;
		
		System.out.printf("---------Programa de busqueda binaria en un vector---------\n");
		System.out.printf("Introduzca el numero que desea buscar en el vector: ");
		elemento = scan.nextInt();
		
		System.out.printf("Ha elegido el elemento %d\n Buscando...\n",elemento);
		
		posicion = ut.BinarySearchRec(VectorOrdenado, elemento);
		
		if(posicion == -1){
			System.out.println("El elemento no se encuentra en el vector");
		}
		else{
			System.out.println("El elemento se encuentra en la posicion "+posicion);
		}	
		scan.close();
	}
}
