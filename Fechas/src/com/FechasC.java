package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FechasC {

	public static void main(String[] args) {

		String linea = "";
		String[] dias = { "primero", "dos", "tres", "4cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince", "diesiseis","diecisiete","diesiocho","diecinueve","veinte","veintiuno","veintidos","veintitres","veinticuatro"};
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciemre" };
		
		String dia = "";
		String mes = "";

		try {
			File archivo = new File("C:\\Users\\pc\\Desktop\\f\\fechas.txt");// busca ladirecciojn
			FileReader fr = new FileReader(archivo);// sabe leer el archivo
			BufferedReader buffer = new BufferedReader(fr);// lee el contenido del archivo
			while ((linea = buffer.readLine()) != null) {
				//System.out.println("linea; " + linea);

				int lineaDia = Integer.parseInt(linea.substring(0, 2));
				int lineaMes = Integer.parseInt(linea.substring(2, 4));
				String a=linea.substring(4,8);
				//System.out.println(año);

				// System.out.println(linea.substring(0,2)+linea.substring(2,4));

				for (int i = 0; i < meses.length; i++) {
					if (i == (lineaMes - 1)) {
						//System.out.println("mes de " + meses[i]);
						mes = meses[i];
						
						
					}

				}
				
				for (int i = 0; i < dias.length; i++) {
					if (i == (lineaDia - 1)) {
						//System.out.println("mes de " + dias[i]);
						dia = dias[i];
						//System.out.println("el dia es "+dia);
					}
				}
				
				if( Integer.parseInt(linea.substring(2, 4))>12) {//convierto un string a entero
					System.out.println("El mes no existe " + linea);
				}else {
					System.out.println(dia+" de "+mes+" del "+a);
				}
			}
		} catch (Exception ex) {
			System.out.println("No encontre el archivo");

		} 
	}
	

}
