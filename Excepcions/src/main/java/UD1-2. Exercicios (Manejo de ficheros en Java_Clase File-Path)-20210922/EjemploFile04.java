package UD1;

import java.io.File;

//Ejemplo que muestra informaci�n del fichero prueba.pdf

public class EjemploFile04 {
	public static void main(final String[] args) {
		System.out.println("Informaci�n sobre el fichero\n");
		String separador= File.separator;
		/*
		 * En carpeta almaceno el path de la carpeta que quiero mirar sus subelementos
		 * File f= new File("D:" +separador+ "Ciclos Formativos" +separador
		 * +"CSDAMultiplataforma" +separador +"BBDD" +separador +"Practicas"
		 * +"alumnos.dat");
		 */
		
		File f= new File("C:" + separador + "Users"+ separador + "dgcives" + separador + "Desktop"+ separador +"A DE ANTONIO"+ separador +"Función.txt");
		System.out.println("Nombre del fichero: " +f.getName());
		System.out.println("Ruta : " +f.getPath());
		System.out.println("Ruta absoluta : " +f.getAbsolutePath());
		System.out.println("Ruta anterior : " +f.getParent());
		System.out.println("Se puede escribir : " +f.canWrite());
		System.out.println("Se puede leer : " +f.canRead());
		System.out.println("Tama�o : " +f.length());
		System.out.println("Es un directorio : " +f.isDirectory());
		System.out.println("Se puede fichero : " +f.isFile());
	}
}

