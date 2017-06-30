package main;

import java.util.ArrayList;

public class Finder<T> {
	
	public interface ContainChecker<T>{
		public boolean containChecker(T object, Object patron);
	}
	
	public ArrayList<T> find(ArrayList<T> list, Object patron, ContainChecker<T> checker){
		
		// TODO definir algoritmo de busqueda
		ArrayList<T> newList = new ArrayList<T>();
		int length= list.size(); 
		
		for (int i=0; i<length; i++){
//			if (containChecker(T list.get(i), Object patron)) 
		}
		
		
		
		
		
		
		
		
		return null;
	}

}
