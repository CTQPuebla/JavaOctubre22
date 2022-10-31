package com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String fecha, linea = "";
		String[] ndiau= {"","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince"};
		String[] ndiade= {"Dieci","Veinti","Treinta"};
		String[] nmes= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		int d, m, a;
		String dia;
		boolean error = false;
		do {
			if (error) {
				System.out.println("Esa no es una fecha REAL. ");
			}
			System.out.print("Ingrese una fecha en numeros(DDMMAAAA): ");
			fecha = entrada.next();
//			System.out.println(fecha.substring(0,2));
//			System.out.println(fecha.substring(2,4));
//			System.out.println(fecha.substring(4,8));
			d = Integer.parseInt(fecha.substring(0,2));
			m = Integer.parseInt(fecha.substring(2,4));
			a = Integer.parseInt(fecha.substring(4,8));
			if (d<=0 || d>31 || m<=0 || m>12 || a<0) {
				error = true;
			} else {
				error = false;
			}
		} while (error);
		if (d<=15) {
			dia=ndiau[d];
		} else if (d==20) {
			dia="Veinte";
		} else if (d==31) {
			dia="Treinta y uno";
		} else {
			dia=ndiade[Integer.parseInt(fecha.substring(0,1))-1];
			dia+=ndiau[Integer.parseInt(fecha.substring(1,2))];
		}
		linea = dia+" de "+nmes[m-1]+" de "+a+"\n";
		System.out.println(dia+" de "+nmes[m-1]+" de "+a);
		try {
			File archivo2 = new File("C:\\Users\\utzma\\OneDrive\\Escritorio\\fichero.txt"); 
			FileWriter palabra = new FileWriter(archivo2, true);   
			for (int i = 0; i <linea.length(); i++) {     
				  palabra.write(linea.charAt(i)); 
			}
			palabra.close();
		} catch (Exception ex) {
			System.out.println("No encontre archivo");		
		}
		
	}// cierre del main
}
