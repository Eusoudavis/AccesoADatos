package UD1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Ejemplo de utilizaci�n de las clase FileWriter y PrintWriter
public class Ejemplo01FileWriterB {
	public static void main(String[] args) throws IOException {
		//array de nombres
		String [] nombres = {"Maria", "Ana", "Santiago", "Jorge", "Iciar", "Isabel", "Pedro", "Manuel"};
		
		escribirString01(nombres);
		escribirString02(nombres);
		escribirString03(nombres);
		escribirCaracter04("Probando");
		escribirArrayCaracter();
	}

	private static void escribirArrayCaracter() {
		char[] caracteres = {'P','r','o','b','a','n','d','o'};
		try{
			FileWriter fw = new FileWriter("Caracteres01.txt");
			fw.write(caracteres);
				
			
			fw.close();
		}catch(IOException io)
		{
			System.out.println("Error");
		}

		
	}

	private static void escribirCaracter04(String string) {
		char[] caracteres = {'P','r','o','b','a','n','d','o'};
		try{
			FileWriter fw = new FileWriter("Caracteres.txt");
			for(int i=0; i<caracteres.length; i++){
				fw.write(caracteres[i]);
				fw.write("\t");
			}
			fw.close();
		}catch(IOException io)
		{
			System.out.println("Error");
		}
		
	}

	private static void escribirString03(String[] nombres) {
		try{
			FileWriter fw = new FileWriter("Nombres02.txt", true);
			 for(int i=0; i< nombres.length; i++){
				 fw.write(nombres[i]);
				 fw.write("\n");
			 }
			 fw.close();
		}catch(IOException io){
			 System.out.println("Error fichero");

		}
		
		
	}

	private static void escribirString02(String[] nombres) {
		try{
			FileWriter fw = new FileWriter("Nombres03A.txt");
			 for(int i=0; i< nombres.length; i++){
				 fw.write(nombres[i]);
				 fw.write("Hola");
			 }
			 fw.close();
		}catch(IOException io){
			 System.out.println("Error fichero");

		}
		
	}

	private static void escribirString01(String [] nombres) {
		
		 File f = new File("Nombres01.txt");
		 try{
			 FileWriter fw = new FileWriter(f);
			 for(int i=0; i< nombres.length; i++){
				 fw.write(nombres[i]);
				 
			 }
			 fw.close();
		 }catch(IOException io){
			 System.out.println("Error fichero");
		 }
	
	}

}
