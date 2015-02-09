package paquete;

import java.util.*;

public class Principal {
	public static void main(String [] args){
		float time = System.nanoTime();
		ArrayList<Integer> a_fib = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("¿Cuantos numeros de la serie de fibonacci desea saber?");
		num = scan.nextInt();
		
		a_fib=f_calcFibonacci(num,a_fib,0);
		scan.close();
		
		System.out.printf("\n %f",time);
	}
	public static ArrayList<Integer> f_calcFibonacci(int num,ArrayList<Integer> a_fib,int flag){
		a_fib.add(1);
		a_fib.add(1);
		
		System.out.print("1, 1");
		if(num > 2){
			f_calcFibonacci(num - 2,a_fib);
		}
		return a_fib;
	}
	public static ArrayList<Integer > f_calcFibonacci(int num,ArrayList<Integer> a_fib){
		if(num != 0){
			a_fib.add(a_fib.get(a_fib.size()-2)+ a_fib.get(a_fib.size()-1));
			System.out.printf(", %d",a_fib.get(a_fib.size()-1));
			f_calcFibonacci(--num,a_fib);
		}
		return a_fib;
	}
}
