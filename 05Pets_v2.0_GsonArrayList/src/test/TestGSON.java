package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.Canido;
import main.Felino;
import main.Mascota;
import main.Person;
import utils.FileHelper;
import utils.GsonHelper;

	public class TestGSON {
	
		@Test
		public void writeFile() {
		
		String data="jklfsjlkdhdsklghklsdhksdhkasdhkjdshjkasdghkjgdshsgkjhsdgkjhgshsajkhsjkhsghgaskhgsajsgdh";
		FileHelper.writeFile(data, "test.txt");
		
		String[] readData= FileHelper.readFile("test.txt");
		String savedData= readData[0];
						
		Assert.assertEquals(data, savedData);
		}
			
		@Test
		public void TestFiletoGSON() {
		ArrayList<Mascota> list = getMockListMascotas();
	
		String newlistaenGSON = GsonHelper.listaMascotasToJson(list);
		FileHelper.writeFile(newlistaenGSON, "datos.JSON");
			
		System.out.print(newlistaenGSON);
		}
	
		
		
		@Test
		public void TestReadGSON() {
		ArrayList<Mascota> list = getMockListMascotas();
		ArrayList<Mascota> list2 = new ArrayList<Mascota>();
	
		String datos2= FileHelper.readFileJSON("datos2.JSON");
		list2= GsonHelper.jsonFromArrayListMascotaToJson(datos2);
		
		Assert.assertEquals(list.size(), list2.size());
		Assert.assertEquals(list.get(1).getNombre(), list2.get(1).getNombre());
								
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
			
			Canido can3= new Canido("Firulais", 40, 0.5f, 0.5f);
			propietario = new Person("Ramon Dos;084584805;ramon@gmail.com;address");
			can3.setPropietario(propietario);
			list.add(can3);
				
			Felino fel4=new Felino("Gardfield", 20, 0.2f, 0.3f);
			propietario = new Person("Jordi Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
			fel4.setPropietario(propietario);
			list.add(fel4);
			
			Felino fel3=new Felino("Adrian", 20, 0.2f, 0.3f);
			propietario = new Person("Ramon Tres;0908397452;ramti@hotmail.com;Av Diagonal 12");
			fel3.setPropietario(propietario);
			list.add(fel3);
					
			return list;
		}
	
		
		
}
