package main;

public class Felino extends Mascota{

	private float calidadGarras;
	
	public Felino(String nombre, float peso, float altura, float largo) {
		super(nombre, peso, altura, largo);
		this.calidadGarras = 1;
		// TODO Auto-generated constructor stub
	}
	
	public float getCalidadGarras() {
		return this.calidadGarras;
	}

	@Override
	public float getEstadoNutricion() {
		// Peso/(altura*largo)
		return getPeso()*(getAltura()*getLargo());
	}	

	
	@Override    												// de un metodo abstracto
	public float getPesoRacion() {
		// 0.2*Peso*(2-CalidadClomillos)
		return 0.2f*getPeso()*(2f-calidadGarras);
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
