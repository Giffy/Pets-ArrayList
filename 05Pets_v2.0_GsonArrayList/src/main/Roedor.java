package main;

public class Roedor extends Mascota {

	public float calidadPelaje;
	
	public Roedor(String nombre, float peso, float altura, float largo){
		super(nombre, peso, altura, largo);		
		this.calidadPelaje = 1;
	}
	
	
	@Override
	public float getEstadoNutricion() {
		// TODO Peso/(alto*largo)
		return getPeso()/(0.3f*getAltura()*getLargo());
	}
	
	@Override    												// de un metodo abstracto
	public float getPesoRacion() {
		// 0.3*Peso*(2-CalidadClomillos)
		return 0.15f*getPeso()*(2f-calidadPelaje);
	}

	public float getCalidadPelaje(){
		return this.calidadPelaje;
	}

	@Override
	protected String getTypeClass() {
		return getClass().getName();
	}
		
	@Override
	public String toString() {
		return super.toString() + " tipo Ave"; 
	}
		
		
}
