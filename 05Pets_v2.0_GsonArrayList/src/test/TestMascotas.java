package test;


import org.junit.Test;
import org.junit.Assert;
import main.Ave;
import main.Canido;
import main.Felino;
// import main.ListaMascotas;
import main.Mascota;
import main.Person;
import main.Roedor;
import main.UserInterface;

public class TestMascotas {

/*
	@Test
	
	public void testAddNewMascota(){
		ListaMascotas list= new ListaMascotas();
		
		String newMascota = "Ave;Firulais;40;0.5f;0.5f;Ramon Dos;084584805;ramon@gmail.com;address";
		list.addNewMascota(newMascota);

		String expected = "Firulais";
		String actual =  list.get(1).getNombre();
		
	}
	
	@Test
	public void testAddNewMascota1(){
		ListaMascotas list= new ListaMascotas();
		
		String newMascota= UserInterface.askMascota();
		list.addNewMascota(newMascota);
				
		String expected = "F";
		String actual =  list.get(1).getNombre();
		
		System.out.println(actual);
		
		Assert.assertEquals(expected, actual);
		
		
		/*
		
		String expected = "Firulais";
		String actual =  result[0].getNombre();
		Assert.assertEquals(expected, actual);
		
		expected = "Gardfield";
		actual =  result[1].getNombre();
		Assert.assertEquals(expected, actual);
						
	}
	
	
	
	
	@Test
	public void testFindByOwnerName(){
		ListaMascotas list= new ListaMascotas();
		
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
		
		String name = "Ramon";
				
		Mascota[] result = list.findByOwnerName(name);
		
		String expected = "Firulais";
		String actual =  result[0].getNombre();
		Assert.assertEquals(expected, actual);
		
		expected = "Gardfield";
		actual =  result[1].getNombre();
		Assert.assertEquals(expected, actual);
						
	}
	
	@Test
	public void testFindByEmail(){
		ListaMascotas list= new ListaMascotas();
		
		Canido can= new Canido("Firulais", 40, 0.5f, 0.5f);
		Person propietario = new Person("Ramon Dos;084584805;ramon@gmail.com;address");
		can.setPropietario(propietario);
		list.add(can);
		
		Felino fel=new Felino("Gardfield", 20, 0.2f, 0.3f);
		propietario = new Person("Jordi Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
		fel.setPropietario(propietario);
		list.add(fel);
		
		Felino fel2=new Felino("Gardfiel", 20, 0.2f, 0.3f);
		propietario = new Person("Ramon Tres;0908397452;jordi@hotmail.com;Av Diagonal 12");
		fel2.setPropietario(propietario);
		list.add(fel2);
		
		String email = "jordi";
				
		Mascota[] result = list.findByOwnerEmail(email);
		

		String expected = "Gardfield";
		String actual =  result[0].getNombre();
		Assert.assertEquals(expected, actual);
		
		expected = "Gardfiel";
		actual =  result[1].getNombre();
		Assert.assertEquals(expected, actual);
						
	}

	
		@Test
		public void testListaMascota2(){
			ListaMascotas list= new ListaMascotas();
			
			list.add(new Canido("Firulais", 40, 0.5f, 0.5f));
			list.add(new Felino("Gardfiel", 20, 0.2f, 0.3f));
			list.add(new Ave("Parrot", 0.5f, 0.1f, 0.15f));
			list.add(new Roedor("Perex", 0.5f, 0.1f, 0.15f));
			/*
			for (int i=0; i<list.size();i++){
				if (list.get(i).getClass().isAssignableFrom(Canido.class)){
					Canido canido= (Canido) list.get(i);
					System.out.println("Mascota: "
									+ canido.getNombre()
									+ list.get(i).getNombre()
									+ "\n Estado mascota: " + canido.getCalidadColmillo()
									+ "\n Peso racion:" + list.get(i).getPesoRacion() );
				}else if (list.get(i).getClass().isAssignableFrom(Felino.class)){
					Felino canido= (Felino) list.get(i);
					System.out.println("Mascota: "
									+ canido.getNombre()
									+ list.get(i).getNombre()
									+ "\n Estado mascota: " + canido.getCalidadGarras()
									+ "\n Peso racion:" + list.get(i).getPesoRacion() );
				}else{
					System.out.println("Mascota: "
									+ list.get(i).getNombre()
									+"\n Estado de nutricion"
									+ "\n Estado mascota: "  );
					
				}
				
			}
			
		*/
	
	
	

	
}
