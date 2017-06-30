package utils;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input {
	
	Scanner reader;  

		    public static int scannInt(){
		    
				@SuppressWarnings("resource")
				Scanner reader = new Scanner(System.in);
				int var = reader.nextInt();
				// reader.close();
				return var;
			}
			
			public static float scannFloat(){
				Scanner reader = new Scanner(System.in);
				float var = reader.nextFloat();
				// reader.close();
				return var;
			}
			
			public static String scannLine(){
				Scanner reader = new Scanner(System.in);
				String var = reader.nextLine();
				// reader.close();
				return var;
			}
			

			public static float scannValidFloat(){
				boolean isRight=false;
				float var=0;
				while (!isRight){
						try{
							isRight=true;
							Scanner reader = new Scanner(System.in);
							var = reader.nextFloat();
						}catch (InputMismatchException e){
							// System.err.println("Error format\n");
							System.out.println("Escribe un numero valido:\n");
							isRight=false;
						}finally{
						}						
				}
				return var;			
			}
			
			public static int scannValidInt(){
				boolean isRight=false;
				int var=0;
				while(!isRight){
					while (!isRight){
							try{
								isRight=true;
								Scanner reader = new Scanner(System.in);
								var = reader.nextInt();
							}catch (InputMismatchException e){
								// System.err.println("Error format\n");
								System.out.println("Escribe un numero valido:\n");
								isRight=false;
							}finally{
							}						
					}
				}
				return var;			
			}
			
			public static String scannValidLine(){
				boolean isRight=false;
				String var= "0";
				while (!isRight){
							try{
								isRight=false;
								Scanner reader = new Scanner(System.in);
								var = reader.nextLine();
								long var2= Long.valueOf(var);
							}catch (NumberFormatException e){				
								isRight=true;
							}
							if (!isRight)
								System.out.println("Escribe un texto valido:");		
				}
				return var;			
			}
				
}		
			
