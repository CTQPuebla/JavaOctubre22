package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		
		  int dia;
		  int mes;
		  String año;
		  String dialet;
		  String meslet;
		  String[] dias = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", 
		        "nueve","diez", "once", "doce","trece", "catorce", "quince", "diesciseis", 
		        "diescisiete", "diesciocho", "diescinueve", "veinte", "veintiuno", "veintidos",
		        "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete",
		        "veintiocho", "veintinueve", "treinta", "treinta y uno"};
		    String[] meses = { "enero", "febrero", "marzo","abril","mayo", "junio", "julio", "agosto", 
		        "septiembre", "octubre", "noviembre", "diciembre"};
		    String linea = " ";
		  
		    
		    try {
		      
		      File archivo = new File("C:\\Users\\Allen\\OneDrive\\Escritorio\\fichero.txt"); //Representación del archivo
		      FileReader fr = new FileReader(archivo); //Saber leer el archivo
		      BufferedReader buffer = new BufferedReader(fr);// Lee el contenido del archivo
		      while ((linea = buffer.readLine()) !=null) {
		        
		        dia = Integer.parseInt(linea.substring(0,2));
		        dialet = dias [dia-1];
		        
		        mes = Integer.parseInt(linea.substring(2,4));
		        meslet = meses [mes-1];
		        
		        año = linea.substring(4,8);
		        
		        System.out.println(dialet + " de " + meslet + " de " + año);
		}
			
			
			
		}catch (Exception  ex) {
			System.out.println( "No encontre el archivo");
			
		}


		
	}//fin main

}//fin
