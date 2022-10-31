package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EjercicioFechas {
public static void main(String[]args) {
	String linea= "";
	
			try {
				File archivo = new File("C:\\Users\\ThinkPad\\Desktop\\fichero.txt");//representacion del archivo
				FileReader fr =new FileReader(archivo);//sabe leer el archivo
				BufferedReader buffer = new BufferedReader(fr);//Lee el contenido del archivo
				while((linea = buffer.readLine()) !=null) {
					System.out.println("linea: " + linea);
				}
			}catch(Exception ex) {
				System.out.println("No encontre el archivo");
			}
}
}
