package main;

public class Canido extends Mascota {
	
	private float calidadColmillo;
	
	public Canido(String nombre){
		super(nombre);
	}
		
	public Canido(String nombre, float peso, float altura, float largo){
		super(nombre, peso, altura, largo);		
		this.calidadColmillo = 1;
	}
		
	public float getCalidadColmillo() {
		return this.calidadColmillo;
	}
	

	@Override
	public float getEstadoNutricion() {
		// TODO Peso/(alto*largo)
		
		return getPeso()/(getAltura()*getLargo());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Esto es un perro";
	}

	@Override    												// de un metodo abstracto
	public float getPesoRacion() {
		// 0.3*Peso*(2-CalidadClomillos)
		return 0.3f*getPeso()*(2f-calidadColmillo);
	}


	@Override
	protected String getTypeClass() {
		return getClass().getName();
	}
		
	


	
	
}
