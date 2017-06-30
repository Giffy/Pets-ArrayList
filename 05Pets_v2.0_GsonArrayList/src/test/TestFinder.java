package test;

import java.util.ArrayList;

import org.junit.Assert;

import main.Canido;
import main.Felino;
import main.Finder;
import main.Mascota;
import main.Person;

public class TestFinder {
	
	public void testFinderByNameMascota(){
		ArrayList<Mascota> list = getMockListMascotas();
		Finder<Mascota> finder = new Finder<Mascota>();
		
		ArrayList<Mascota> resultList=
				finder.find(list, "Parrot", new Finder.ContainChecker<Mascota>() {
					@Override
					public boolean containChecker(Mascota mascota, Object patron) {
						return mascota.getPropietario().getName()
								.equals((String) patron);
					}
		});
		
		Assert.assertEquals(1, resultList.size());
		Assert.assertEquals("Piolin", resultList.get(0).getNombre());
		
		
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
