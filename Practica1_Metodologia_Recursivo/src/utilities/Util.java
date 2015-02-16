package utilities;

public class Util<T extends Comparable<T>> {
	
	public int BinarySearchRec(T [] t, T el){
		return BinarySearchRec(t,el,0,t.length - 1);
	}
	private int BinarySearchRec(T [] t, T el, int li, int ls){
		int posicion = (li + ls)/2;
		
		if(li > ls){
			return -1;
		}
		else{
			if(el != t[posicion]){
				if(el.compareTo(t[posicion]) < 0){
					posicion = BinarySearchRec(t,el,li,posicion-1);
				}
				else{
					posicion = BinarySearchRec(t,el,posicion+1,ls);
				}
			}
			else{
				return posicion;
			}
		}
		return posicion;
	}
	
	public double TelescopicSumIterative(Integer num){
		double resultado = 0;
		for(int i = 1 ;i <= num;i++){
			resultado += (Math.pow(-1, i - 1)/(Math.pow(i, 2)));
		}
		return resultado;
	}
	public double TelescopicSumRecursive(Integer num){
		return TelescopicSumRecursive(num,num);
	}
	
	private double TelescopicSumRecursive(Integer num,Integer cont){
		return !cont.equals(0) ? (Math.pow(-1, cont -1)/Math.pow(cont, 2)) + TelescopicSumRecursive(num,--cont) : 0;
	}
}
