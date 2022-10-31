package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio1DYMM {
	
	public static void main(String[] args) {
		
		String[] textod�a = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", 
				"nueve","diez", "once", "doce","trece", "catorce", "quince", "diesciseis", 
				"diescisiete", "diesciocho", "diescinueve", "veinte", "veintiuno", "veintidos",
				"veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete",
				"veintiocho", "veintinueve", "treinta", "treinta y uno"};
		String[] textomes = { "enero", "febrero", "marzo","abril","mayo", "junio", "julio", "agosto", 
				"septiembre", "octubre", "noviembre", "diciembre"};
		String linea = " ";
		int dia;
		int mes;
		String a�o;
		String diacod;
		String mescod;
		
		try {
			
			File archivo = new File("C:\\Users\\diego\\Desktop\\fichero.txt"); //Representaci�n del archivo
			FileReader fr = new FileReader(archivo); //Saber leer el archivo
			BufferedReader buffer = new BufferedReader(fr);// Lee el contenido del archivo
			while ((linea = buffer.readLine()) !=null) {
				
				dia = Integer.parseInt(linea.substring(0,2));
				diacod = textod�a [dia-1];
				
				mes = Integer.parseInt(linea.substring(2,4));
				mescod = textomes [mes-1];
				
				a�o = linea.substring(4,8);
				
				System.out.println(diacod + " de " + mescod + " de " + a�o);
				
			}
			
		
		}catch (Exception ex) {
			
			System.out.println("No encontr� el archivo");
			
		}
		
	}
	
}
