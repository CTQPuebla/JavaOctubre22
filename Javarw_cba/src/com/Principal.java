package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

		public class Principal {
			public static void main(String[] args) {
		
		//Lectura y escritura de archivos
		String lectura = "";
		try {
			File archivo = new File("C:\\Users\\Allen\\OneDrive\\Escritorio\\fichero.txt"); //Reprecentacion del archivo
			FileReader fr = new FileReader(archivo); //Save leer el archivo
			BufferedReader buffer = new BufferedReader(fr); //Lee el contenido del archivo
			String linea;
			while ((linea = buffer.readLine()) !=null) {
				System.out.println("Linea " + linea);
			}
			
			
//			String abc= "abcdefghi\n";
//			File archivo2 = new File("C:\\Users\\Allen\\OneDrive\\Escritorio\\fichero.txt"); 
//		  FileWriter line = new FileWriter(archivo2, true); 
//		   
//		  for (int i = 0; i <abc.length(); i++) { 
//		    
//		   line.write(abc.charAt(i)+"\n"); 
//		  } 
//		  line.close();
			
			
		}catch (Exception  ex) {
			System.out.println( "No encontre el archivo");
			
		}
		
	  
		
		
	}//fin main

}//fin
