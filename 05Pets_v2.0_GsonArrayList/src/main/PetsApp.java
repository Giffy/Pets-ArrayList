package main;

import java.util.ArrayList;

import utils.FileHelper;
import utils.GsonHelper;
import utils.Input;

public class PetsApp {

	private static final String DATA_FILE = "datos.JSON";

	public static void main(String args[]){
		
		ArrayList<Mascota> listMascotas = new ArrayList<Mascota>();
		String datos= FileHelper.readFileJSON(DATA_FILE);
		listMascotas= GsonHelper.jsonFromArrayListMascotaToJson(datos);
		
		String key="";
		do{
			UserInterface.bienvenida();
			key= Input.scannLine().toLowerCase();
//			key= "con";
			switch(key){
				case"add":  listMascotas.add(UserInterface.addNewMascota());
							String list2= GsonHelper.listaMascotasToJson(listMascotas);
							FileHelper.writeFile(list2, DATA_FILE);
							pause();
							break;
				case"lis":  UserInterface.listarMascotas(listMascotas);
							pause();
							break;
				case"con":  String critBusqueda=UserInterface.askSearchType();
							if (critBusqueda == "") break;
							switch (critBusqueda){
								case "nombre": 
									String name = UserInterface.askName().toLowerCase();
									HelperMascota.findName(listMascotas, name);
								break;
								case "e-mail":
									String email = UserInterface.email().toLowerCase();
								break;
								default: 
									throw new RuntimeException(
											"Los parametros de entrada solo pueden ser nombre o e-mail.");
							}
							
							
							
							
/*							String criterio=UserInterface.typeOfsearch(listMascotas);
							String criterio = "nombre";
							UserInterface.listarMascotasPor(listMascotas, criterio);				// Mostrar lista por criterio
							System.out.println("\nElige el identificador del propietario.");
							int id2= UserInterface.idModificar(listMascotas.size());				// Preguntar id a modificar
							
							// UserInterface.showTitle();							// Mostrar titulo
							Person[] candidate = new Person [1];
							// candidate[0]=list.get(id2-1);
							// UserInterface.showList(candidate);
							// UserInterface.changeData(list.get(id2-1));
							// FileHelper.writeFile(list.toFileFormat(),FILE_NAME);
							 	
							 
							break;
				case"del": 	
							UserInterface.showListDelete (listMascotas);
							criterio = "nombre";
							UserInterface.listarMascotasPor(listMascotas, criterio);				// Mostrar lista por criterio
							
							pause();
							// int id= UserInterface.deleteMascota(listMascotas);
							// listMascotas.remove(id);
							FileHelper.writeFile(GsonHelper.listaMascotasToJson(listMascotas), DATA_FILE);
							*/
							break;	
				
				default: break;
				
			}
			
			
		}while (!key.equals("salir"));
		
		
	}

	private static void pause() {
		String Stop= Input.scannLine();
	}

}
