package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ptincipal {

	public static void main(String[] args) {
		//lectura y escritur de archivos
	
		String linea="";
		try {
//			File archivo=new File("C:\\Users\\pc\\Desktop\\f\\fichero.txt");//busca ladirecciojn
//			FileReader fr=new FileReader(archivo);//sabe leer el archivo
//			BufferedReader buffer=new BufferedReader(fr);//lee el contenido del archivo
//			while((linea = buffer.readLine()) !=null) {
//				System.out.println("linea; "+ linea);
			String abc="asvbjiytmnb\n";
			File archivo2 = new File("C:\\Users\\pc\\Desktop\\f\\fichero.txt"); 
		  FileWriter line = new FileWriter(archivo2, true); 
		   
		  for (int i = 0; i <abc.length(); i++) { 
		    
		   line.write(abc.charAt(i)); 
		  } 
		  line.close();
			
		}catch(Exception ex) {
			System.out.println("No encontre el archivo");
			
		}//cortar strings substring, integer.parseint.arrays

	}

}
