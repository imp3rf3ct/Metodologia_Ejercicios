package paquete;
import java.util.*;

public class Principal {
	public static void main(String [] args){
		ArrayList<String> array = new ArrayList<String>();
		
		for(int i = 0;i < 100; i++){
			array.add(Integer.toString(i*i));
			System.out.printf("%d\n",Integer.parseInt(array.get(i)));
		}
	}
}
