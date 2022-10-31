package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FechasNT {
	
	public static void main(String[] args) {
		
		//Lectura y escritura de archivos
		
		String linea = "";
		
		
		try {
			
			File archivo = new File("C:\\Users\\Juanito Bananas\\Desktop\\Hola.txt");//Representacion del archivo
			FileReader fr = new FileReader(archivo);//Sabe leer el archivo
			BufferedReader buffer = new BufferedReader(fr);//Lee el contenido del archivo
			while((linea = buffer.readLine()) != null) {
				System.out.println("Linea: " + linea);
				
				String[] texto = {"Uno","Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve","Veinte", "Veintiuno", "Veintidos", "Veintitres", "Veinticuatro"};
				String[] textom = {"Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"};
				
				
				int dia = Integer.parseInt(linea.substring(0,2));
				int mes = Integer.parseInt(linea.substring(2,4));
				int anio = Integer.parseInt(linea.substring(4,8));
				
				String Cadenad = Integer.toString(dia);
				String Cadenam = Integer.toString(mes);
				
				
				System.out.println(texto[Integer.parseInt(Cadenad)-1] + " de " + textom[Integer.parseInt(Cadenam)-1] + " de " + anio);

					}
				
			
			
		} catch(Exception ex) {
			System.out.println("No encontré el archivo");
		}
		

		
	}

}
