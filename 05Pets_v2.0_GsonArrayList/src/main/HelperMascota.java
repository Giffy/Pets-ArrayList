package main;

import java.util.ArrayList;
import java.util.Comparator;

public class HelperMascota {
	
	

	public static void sortArrayMascotaByLenght(ArrayList<Mascota> list){
		list.sort(new Comparator<Mascota>() {
		
			@Override
			public int compare(Mascota o1, Mascota o2) {
				int r=0;
				if (o1.getLargo()<o2.getLargo()){
					r= -1;
				}else if(o1.getLargo()>o2.getLargo()){
					r= 1;
				}
				return r;
			}		
		});
	}
	
	public static void sortArrayMascotaByName(ArrayList<Mascota> list){
		list.sort(new Comparator<Mascota>() {
			int r=0;

			@Override
			public int compare(Mascota o1, Mascota o2) {
				return o1.getNombre().compareToIgnoreCase(o2.getNombre());
			}
			
		});
		
	}
	
	public static void sortArrayMascotaByEmailOwner(ArrayList<Mascota> list){
		list.sort(new Comparator<Mascota>() {
			int r=0;

			@Override
			public int compare(Mascota o1, Mascota o2) {
				return o1.getPropietario().getEmail()
						.compareToIgnoreCase(o2.getPropietario().getEmail());
			}
			
		});
	}

	public static ArrayList<Mascota> findName(ArrayList<Mascota> list, String name) {
		ArrayList<Mascota> newlist= new ArrayList<Mascota>();
		
		int f=0;
		for (int i=0; i<list.size();i++){
			String fullName=list.get(i).getPropietario().getFullName().toLowerCase();
			
			if (list.get(i).getPropietario().getFullName().toLowerCase().contains(name)){
				
				newlist.set(f, list.get(i));
				f++;
				System.out.println(newlist.get(f));
			}
		
		}
	
	
	
	
		
		
		
		return null;
		
	}

	
	
}
