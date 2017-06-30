package main;

import java.util.ArrayList;

public class Finder<T> {
	
	public interface ContainChecker<T>{
		public boolean containChecker(T object, Object patron);
	}
	
	public ArrayList<T> find(ArrayList<T> list, Object patron, ContainChecker<T> checker){
		
		// TODO definir algoritmo de busqueda
		
		int length= list.size();
		
	/*	for (int i=0; i<length; i++){
			list.get(0).
		}
		*/
		
		
		
		
		
		
		
		return null;
	}

}
