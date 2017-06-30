package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.Canido;
import main.Felino;
import main.Mascota;
import main.Person;


public class TestHelperMascota {
	/*
	@Test
	public void testSortByName(){
		
				
		ArrayList<Mascota> list = new ArrayList<Mascota>();

		Canido can= new Canido("Firulais", 40, 0.5f, 0.5f);
		Person propietario = new Person("Ramon Dos;084584805;ramon@gmail.com;address");
		can.setPropietario(propietario);
		list.add(can);
			
		Felino fel=new Felino("Gardfield", 20, 0.2f, 0.3f);
		propietario = new Person("Jordi Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
		fel.setPropietario(propietario);
		list.add(fel);
		
		Felino fel2=new Felino("Gardfield", 20, 0.2f, 0.3f);
		propietario = new Person("Ramon Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
		fel2.setPropietario(propietario);
		list.add(fel2);

		
		
		
		int size= list.size() -1;
		
		for (int i=0; i<size; i++{
			Assert.equalsTrue(TRUE, )
		})
		
		
	}		
	*/
		@Test
		public void testSortArrayMascotaByName(){
			ArrayList<Mascota> list = getMockListMascotas();
			main.HelperMascota.sortArrayMascotaByName(list);
			
			Assert.assertEquals( "Adrian",list.get(0).getNombre());
			Assert.assertEquals( "Firulais",list.get(1).getNombre());
			Assert.assertEquals( "Gardfield",list.get(2).getNombre());
		}

	
		@Test
		public void testSortArrayMascotaByEmailOwner(){
			ArrayList<Mascota> list = getMockListMascotas();
			main.HelperMascota.sortArrayMascotaByEmailOwner(list);
			
			Assert.assertEquals( "jordi@hotmail.com",list.get(0).getPropietario().getEmail());
			Assert.assertEquals( "ramon@gmail.com",list.get(1).getPropietario().getEmail());
			Assert.assertEquals( "ramti@hotmail.com",list.get(2).getPropietario().getEmail());
			
		}
	
		
		public ArrayList<Mascota> getMockListMascotas(){ 	 
		
			ArrayList<Mascota> list = new ArrayList<Mascota>();
			
			Canido can= new Canido("Firulais", 40, 0.5f, 0.5f);
			Person propietario = new Person("Ramon Dos;084584805;ramon@gmail.com;address");
			can.setPropietario(propietario);
			list.add(can);
				
			Felino fel=new Felino("Gardfield", 20, 0.2f, 0.3f);
			propietario = new Person("Jordi Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
			fel.setPropietario(propietario);
			list.add(fel);
			
			Felino fel2=new Felino("Adrian", 20, 0.2f, 0.3f);
			propietario = new Person("Ramon Tres;0908397452;ramti@hotmail.com;Av Diagonal 12");
			fel2.setPropietario(propietario);
			list.add(fel2);
					
			return list;
		}
	
	
	
	
}
