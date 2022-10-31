package com;

import java.io.*;

public class Ejercicio1_Manejo_archivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String linea = "";
		int dia;
		int mes;
		String[] meses = {"Enero", "Febrero" , "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre", "Octubre", "Noviembre","Diciembre"};
		String[] numeros = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete","ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciseies", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "ventidos", "ventitres", "venticuatro", "venticinco", "ventiseis", "ventisiete, veintiocho, ventinueve, treinta" };
		try{
			File archivo = new File("D:\\Escritorio\\hola2.txt"); //Representacion del archivo
			FileReader fr= new FileReader(archivo); // leer el archivo
			BufferedReader  buffer = new BufferedReader(fr); //lee el contenido
			
			while((linea = buffer.readLine()) != null) {
				
				dia = Integer.parseInt(linea.substring(0, 2));
				mes = Integer.parseInt(linea.substring(2, 4));
				
				System.out.println(numeros[dia-1]+" de "+meses[mes-1]+" "+Integer.parseInt(linea.substring(4, 8)));
			}
			
		}catch(Exception ex){
			System.out.println("No encontre el archivo");
		}

	}

}
