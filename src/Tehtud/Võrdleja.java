package Tehtud;

public class Võrdleja<T extends Comparable<T>> {
	public T leiaSuurem(T elem1, T elem2){
		if (elem1.compareTo(elem2) > 0){
			return elem1;
		}else {
			return elem2;
		}
	}
}
