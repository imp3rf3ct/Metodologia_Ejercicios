package paquete;

import java.util.*;

public class Principal {
	public static void main(String [] args){
		int num_fibonacci = 1,i;
		ArrayList<Integer> fib = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		fib.add(num_fibonacci);
		fib.add(num_fibonacci);
		
		System.out.print("¿Cuantos numeros de la serie de fibonacci desea saber?");
		
		i = scan.nextInt();
		
		for(int j=1;j<i;j++){
			fib.add(fib.get(j-1)+fib.get(j));
		}
		for(int k = 0;k<i;k++){
			System.out.print(fib.get(k)+" ");
		}
		
		scan.close();
	}
}
