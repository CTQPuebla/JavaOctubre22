package com;

import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lectura y escritura de archivos
		
		/*String linea = "";
		try{
			File archivo = new File("D:\\Escritorio\\hola.txt"); //Representacion del archivo
			FileReader fr= new FileReader(archivo); // leer el archivo
			BufferedReader  buffer = new BufferedReader(fr); //lee el contenido
			
			while((linea = buffer.readLine()) != null) {
				System.out.println("linea: "+ linea);
			}
			
		}catch(Exception ex){
			System.out.println("No encontre el archivo");
		}*/
		
		
		try {
			String abc=" Hola buenas noches\n";
			File archivo2 = new File("D:\\Escritorio\\hola.txt"); 
			FileWriter line = new FileWriter(archivo2,true);
			
			for (int i = 0; i <abc.length(); i++) { 
				
				line.write(abc.charAt(i)+"\n");
			
		 } 
		 
			line.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No encontre el archivo");
		} 
		
		

	}

}
