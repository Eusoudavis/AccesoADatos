package UD1;

import java.io.File;

/*
 * En el siguiente ejemplo mostramos todos los ficheros pdf que tenemos en la
 * carpeta probasAD, dentro da carpeta CiclosFormativos en MI disco F.
 */
public class EjemploFile03 {
	public static void main(final String[] args) {
		//separador alamacena el tipo de separador utilizado en la plataforma, en windows \
		String separador= File.separator;

		//En carpeta almaceno el path de la carpeta que quiero mirar sus subelementos
		//File carpeta= new File("D:" +separador+ "Ciclos Formativos" + 		separador +"CSDAMultiplataforma");
		File carpeta = new File("C:" + separador + "Users"+ separador + "dgcives" + separador + "Desktop"+ separador +"A DE ANTONIO");

		System.out.println("Carpeta: " +carpeta);

		//En elementos almaceno la matriz con todos los nombres de los archivos
		// y carpetas dentro_de la carpeta que le indiqu�
		String[] elementos = carpeta.list();

		//Mostramos el n�mero de carpetas dentro de la que le dije
		System.out.println("Los ficheros .pdf son:\n");
		for (int i=0; i<elementos.length; i++){
			if (elementos[i].endsWith("pdf") || elementos[i].endsWith("txt")){
				System.out.println("\t" +carpeta.getAbsolutePath() +separador +elementos[i]);
			} // fin del if
		} // fin de for
	} // fin del main
} // fin de la clase

