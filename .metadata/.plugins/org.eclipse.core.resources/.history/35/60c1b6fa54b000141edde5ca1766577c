package utilities;

public class Util<T extends Comparable> {
	
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
}
