package test;

import org.junit.Test;

import utils.Input;

public class TestInput {
	
	
	
	@Test
	public void scannValidLine(){
	
		System.out.println("Escribe un texto");
				
		String a= Input.scannValidLine();
		
		System.out.println(a);
	}

}
