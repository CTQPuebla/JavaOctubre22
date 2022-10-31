package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ActividadRW1YHZ {

	public static void main(String[] args) {
		
		String linea = "";
		int dia=0;
		int mes = 0;
		int año = 0;
		String rdia="";
		String rmes="";
		try {
			File archivo = new File("C:\\Users\\evang\\OneDrive\\Escritorio\\fecha.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			while ((linea = buffer.readLine())!=null) {
				
				dia = Integer.parseInt(linea.substring(0, 2));
				mes = Integer.parseInt(linea.substring(2, 4));
				año = Integer.parseInt(linea.substring(4, 8));

				
				switch(dia) {
				case 1: 
					rdia = "Uno de ";
					break;
				case 2:
					rdia = "Dos de ";
					break;
				case 3:
					rdia = "Tres de ";
					break;
				case 4:
					rdia = "Cuatro de ";
					break;
				case 5:
					rdia = "Cinco de ";
					break;
				case 6:
					rdia = "Seis de ";
					break;
				case 7:
					rdia = "Siete de ";
					break;
				case 8:
					rdia = "Ocho de ";
					break;
				case 9:
					rdia = "Nueve de ";
					break;
				case 10:
					rdia = "Diez de ";
					break;
				default:
					System.out.println("Desconocido");
				}
				
				
				switch(mes) {
				case 1: 
					rmes = "Enero de ";
					break;
				case 2:
					rmes = "Febrero de ";
					break;
				case 3:
					rmes = "Marzo de ";
					break;
				case 4:
					rmes = "Abril de ";
					break;
				case 5:
					rmes = "Mayo de ";
					break;
				case 6:
					rmes = "Junio de ";
					break;
				case 7:
					rmes = "Julio de ";
					break;
				case 8:
					rmes = "Agosto de ";
					break;
				case 9:
					rmes = "Septiembre de ";
					break;
				case 10:
					rmes = "Octubre de ";
					break;
				case 11:
					rmes = "Noviembre de ";
					break;
				case 12:
					rmes = "Diciembre de ";
					break;
				default:
					System.out.println("Desconocido");
				}
				System.out.println(rdia+rmes+año);
			}
			
		}catch (Exception ex) {
			System.out.println("No encontre el archivo");
		}

	}

}
