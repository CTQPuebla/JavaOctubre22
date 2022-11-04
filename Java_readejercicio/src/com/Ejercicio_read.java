package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejercicio_read {

	public static void main(String[] args) {
	
	int dia;
	int mes;
	String linea = "";
	String [] numeros = {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","veintinueve","treinta"};
	String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	try {
		
		File archivo = new File ("C:\\Users\\alexb\\OneDrive\\Escritorio\\nuevo.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader buffer = new BufferedReader (fr);
		while ((linea =  buffer.readLine()) != null) {
			
			
			dia = Integer.parseInt(linea.substring(0,2));
			mes = Integer.parseInt(linea.substring(2,4));
			
			System.out.println(numeros[dia-1]+ " de " + meses [mes-1] + " " + Integer.parseInt(linea.substring(4,8)));
			
			
		}} catch (Exception ex) {
			
			System.out.println("No encontre el archivo");
		}
	
	
	
			
		
	
	
	}

}
