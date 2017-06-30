package main;

import java.util.ArrayList;

import utils.Input;

public class UserInterface {
	
	@Deprecated
	public static String askMascota(){
		System.out.print("Tipo de mascota?   Ave, Canido, Felino o Roedor");
		String object = Input.scannLine();
		
		System.out.print("Cual es el nombre de la mascota?");
		String name = Input.scannLine();
		
		System.out.print("Cual es el peso?");
		float peso = Input.scannFloat();
		
		
		System.out.print("Cual es la altura?");
		float altura = Input.scannFloat();

		System.out.print("Cual es el largo?");
		float largo = Input.scannFloat();

		System.out.print("Cual es el nombre y apellidos del propietario?");
		String ownerName = Input.scannLine();

		System.out.print("Cual es el telefono?");
		float phone = Input.scannFloat();

		System.out.print("Cual es el email?");
		String email = Input.scannLine();

		System.out.print("Cual es el direccion?");
		String address = Input.scannLine();
			
		return object + ";" + name + ";" + peso + ";" + altura + ";" + largo + ";" + ownerName + ";" + phone + ";" + email + ";" + address;
		
	}

	public static void bienvenida() {
		System.out.print("\t\t\t\n ****************************");
		System.out.print("\t\t\t\n * Bienvenido a Veterinaria *");
		System.out.print("\t\t\t\n ****************************");
		System.out.print("\t\t\n"
						+ "\t\t\nADD -> Para añadir una mascota"
						+ "\t\t\nDEL -> Para dar de baja una mascota"
						+ "\t\t\nMOD -> Para editar una mascota"
						+ "\t\t\nCON -> Para consultar una mascota"
						+ "\t\t\nLIS -> Para listar todas las mascotas"
						+"\t\t\n\nSalir para cerrar el programa");
		System.out.print("\t\t\n\nEscribe tu eleccion:");						
		
	}

	public static Mascota addNewMascota() {
	
		boolean isTypeOK=false;
		String object = null;
		Mascota result=null; 
				
		do{  
			System.out.print("Tipo de mascota?   Ave, Canido, Felino o Roedor");
			object = Input.scannLine();
			switch (object.toLowerCase()){
			case "ave":  isTypeOK= true; break;
			case "canido":  isTypeOK= true; break;
			case "felino":  isTypeOK= true; break;
			case "roedor":  isTypeOK= true; break;
			default:isTypeOK= false; break;}		
		} while (!isTypeOK);
		
		System.out.print("Cual es el nombre de la mascota?");
		String name = Input.scannLine();
		
		System.out.print("Cual es el peso?");
		float peso = Input.scannValidFloat();
				
		System.out.print("Cual es la altura?");
		float altura = Input.scannValidFloat();

		System.out.print("Cual es el largo?");
		float largo = Input.scannValidFloat();

		System.out.print("Cual es el nombre y apellidos del propietario?");
		String ownerName = Input.scannLine();

		System.out.print("Cual es el telefono?");
		float phone = Input.scannFloat();

		System.out.print("Cual es el email?");
		String email = Input.scannLine();

		System.out.print("Cual es el direccion?");
		String address = Input.scannLine();
		
		switch (object.toLowerCase()){
			case "ave":
				Ave ave= new Ave(name, peso, altura, largo);
				Person ownerAve = new Person(ownerName+";"+phone+";"+email+";"+address);
				ave.setPropietario(ownerAve);
				result = ave; 
				break;
			case "canido":
				Canido canido= new Canido(name, peso, altura, largo);
				Person ownerCan = new Person(ownerName+";"+phone+";"+email+";"+address);
				canido.setPropietario(ownerCan);
				result = canido; 
				break;
			case "felino":
				Felino felino= new Felino(name, peso, altura, largo);
				Person ownerFelino = new Person(ownerName+";"+phone+";"+email+";"+address);
				felino.setPropietario(ownerFelino);
				result = felino; 
				break;
			case "roedor":
				Roedor roedor= new Roedor(name, peso, altura, largo);
				Person ownerRoedor = new Person(ownerName+";"+phone+";"+email+";"+address);
				roedor.setPropietario(ownerRoedor);
				result = roedor; 
				break;
			default:
				break;
		}		
		return result; 
	}

	
	public static void listarMascotas(ArrayList<Mascota> listMascotas) {
			System.out.print("\n");
		for (int i=0; i<listMascotas.size();i++){
			String strTypeMascota = listMascotas.get(i).getTypeClass();
			String typeMascota = strTypeMascota.replaceAll("main.", "");
			
			
			System.out.println("\tNombre de la mascota: " + listMascotas.get(i).getNombre()
							+" ("+ typeMascota + ") "
							+ "\tPropietario: " + listMascotas.get(i).getPropietario().getFullName());
		}
	}

	
	public static void consulta(ArrayList<Mascota> listMascotas) {
		System.out.println("\n Quien es el propietario de la mascota que quieres consultar?");
		for (int i=0; i<listMascotas.size();i++){
			System.out.println("\t" + (i+1) +" " + listMascotas.get(i).getPropietario().getFullName());
		}
			int id= Input.scannInt();
			
			

		
	}


	public static void showListDelete (ArrayList<Mascota> listMascotas) {
		System.out.println("\n Selecciona el propietario de la mascota que quieres dar de baja?");
		for (int i=0; i<listMascotas.size();i++){
			System.out.println("\t" + (i+1) +" " + listMascotas.get(i).getPropietario().getFullName());
		}
		
	}
	
	/**
	 * Lista los atributo con indice al principio  
	 * 		Si el String contiene:
	 * 			 mascota  	muestra la lista de mascotas
	 * 			 nombre		muestra la lista de propietarios
	 * 			 e-mail		muestra la lista de emails
	 * @param ArrayList : listMascotas  = ArrayList <Mascota>
	 * @param String :  criterio  (puede contener  Mascota, nombre o e-mail)   
	 */
	
	public static void listarMascotasPor(ArrayList<Mascota> listMascotas, String criterio ) {
		System.out.print("\n");
		for (int i=0+1; i<listMascotas.size()+1;i++){
			switch (criterio.toLowerCase()){
				case "mascota": 
					System.out.println("\t"+ i + "  " +listMascotas.get(i-1).getNombre());		
				break;
				case "nombre": 
					System.out.println("\t"+ i + "  " +listMascotas.get(i-1).getPropietario().getFullName());
				break;
				case "e-mail": 
					System.out.println("\t"+ i + "  " +listMascotas.get(i-1).getPropietario().getEmail());
				break;
				default: break;
			}
		}
	}

	/*
	 public static int idModificar(ArrayList<Mascota> listMascotas) {
	 
		System.out.print ( "\nEscribe la referencia del contacto a modificar: " );
		int id;
		id= Input.scannInt();
		if (id>=0 || id<listMascotas.size()){
			result=id
		}else{
		id= Input.scannInt();
		}
		return 0;
	}
	*/

	public static String typeOfsearch(ArrayList<Mascota> listMascotas) {
		// TODO Auto-generated method stub
		System.out.println("\n\t Elige como mostrar la lista de animales por:"
							+ "\n\t\t Nombre del propietario (escribe: nombre)"
							+ "\n\t\t e-Mail del propietario (escribe: e-mail)");
		String id= Input.scannLine().toLowerCase();
		String result=null;
		boolean isRight= false;
		do{
			switch (id){
				case "nombre": result=id; isRight=true; break;
				case "e-mail": result=id; isRight=true; break;
				default: System.out.println("\n Opcion no valida, selecciona   NOMBRE o E-MAIL ");
			}
		}while(isRight= false);		
		return result;
	}

	public static int idModificar(int size) {
		boolean isRight=false;
		int id=0;
		do{
			id= Input.scannValidInt();
			if (id>0 && id<size){
				isRight=true;
				System.out.println("ok");
			}
		}while(isRight= false);
		return id;
	}

	public static String askSearchType() {
		System.out.println("\nBuscar por nombre o e-mail de propietario.\nEscribe NOMBRE o E-MAIL ");
		String result="";
		boolean isRight=false;
		while(!isRight){
				String key= Input.scannLine().toLowerCase();
				switch (key){
					case "nombre": result=key; isRight=true;break;
					case "e-mail": result=key; isRight=true;break;
					case "": isRight=true;break;
					default: System.out.println("Escribe NOMBRE, E-MAIL o nada para volver al menu principal."); isRight=false;break;
				}
		}
		return result;
	}

	public static String askName() {
		System.out.println("\nEscribe el nombre del propietario.\n");
		String name= Input.scannLine();
		return name;
	}

	public static String email() {
		System.out.println("\nEscribe el e-mail del propietario.\n");
		String email= Input.scannLine();
		return email;
	}


	
	
}
