package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	
	public static void main(String[] args) {
		//Lectura & escritura de archivos
		String linea = "";
			try {
//				File archivo = new File("C:\\Users\\HP\\Desktop\\fichero\\fichero.txt");//representacion del archivo
//				FileReader fr = new FileReader(archivo); //Sabe leer el archivo
//				BufferedReader buffer = new BufferedReader(fr); //lee	el contenido del archivo
//				while ((linea = buffer.readLine()) != null) {
//					System.out.println("Linea: " + linea);
//				}
				String abc = "abcdefghi\n";
				  File archivo2 = new File("C:\\Users\\HP\\Desktop\\fichero\\fichero.txt"); 
				  FileWriter line = new FileWriter(archivo2, true); 
				   
				  for (int i = 0; i <abc.length(); i++) { 
				    
				   line.write(abc.charAt(i)+"\n"); 
				  } 
				  line.close();
			}catch(Exception ex) {
				System.out.println("no encontre el archivo");
			}

	
	}
		
		

}
