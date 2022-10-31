package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Principal {
	public static void main(String[] args) {
		String linea = "";
//		// leer archivos
//		try {
//			File archivo = new File("C:\\Users\\utzma\\OneDrive\\Escritorio\\fichero.txt");
//			FileReader fr = new FileReader(archivo);
//			BufferedReader buffer = new BufferedReader(fr);
//			while ((linea = buffer.readLine()) != null ) {
//				System.out.println("Linea: "+linea);
//			} 
//		} catch (Exception ex) {
//			System.out.println("No encontre archivo");
//		} 
		//Escribir archivos 
		try {
			String abc = "Ejemplo de escritura de archivos en java\n";
			File archivo2 = new File("C:\\Users\\utzma\\OneDrive\\Escritorio\\fichero.txt"); 
			FileWriter line = new FileWriter(archivo2, true);   
			for (int i = 0; i <abc.length(); i++) {     
				  line.write(abc.charAt(i)); 
			}
			line.close();
		} catch (Exception ex) {
			System.out.println("No encontre archivo");		
		}
		
	}	
}
