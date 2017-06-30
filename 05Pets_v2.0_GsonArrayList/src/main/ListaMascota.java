package main;

import java.util.ArrayList;

public class ListaMascota {

	
	ArrayList<Mascota> list = new ArrayList<Mascota>();
	

	public void add(Mascota mascota){
		list.add(mascota);
	}
	
	public Mascota get(int index){
		return list.get(index);
	}
	
	public int size(){
		return list.size();
	}
			
	public void remove (int index){
		list.remove(index);		
	}
	
/*	public Mascota[] findByOwnerName(String strname){
		ArrayList<Mascota> foundNames = new  ArrayList<Mascota>();
		
		for(int i=0; i<list.size(); i++){
			int counter = 0;
			if(list.get(i).getPropietario().getFullName().startsWith(strname)){
				foundNames.add(list.get(i));					
			}
		}
		return foundNames;
	}
*/	
	public void addNewMascota(String newMascota){
		String[] values = newMascota.split(";");
			
		String nombre = values[1];
		Float peso =  Float.valueOf(values[2]);
		Float altura = Float.valueOf(values[3]);
		Float largo = Float.valueOf(values[4]);
		String newOwner= toPropietarioFormat(values[5], values[6], values[7], values[8]);
		Person propietario = new Person(newOwner);
	
			
		if (values[0].toLowerCase()=="ave"){
			Ave ave= new Ave(nombre, peso, altura, largo);
			ave.setNombre(nombre);
			ave.setPeso(peso);
			ave.setAltura(altura);
			ave.setLargo(largo);
			ave.setPropietario(propietario);
			// add(ave);
		}else if (values[0].toLowerCase()=="canido"){		
			Canido can= new Canido(nombre, peso, altura, largo);
			can.setPropietario(propietario);
			// add(can);
		}else if (values[0].toLowerCase()=="felino"){		
			Felino fel= new Felino(nombre, peso, altura, largo);
			fel.setPropietario(propietario);
			add(fel);
		}else if (values[0].toLowerCase()=="roedor"){		
			Roedor roe= new Roedor(nombre, peso, altura, largo);
			roe.setPropietario(propietario);
			add(roe);
		}
						
	}
		
	public String toPropietarioFormat(String ownerName, String phone, String email, String address){
		return  ownerName + ";" + phone + ";" + email + ";" + address; 
	}
		

}
