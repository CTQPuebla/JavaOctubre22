package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fechas {

	public static void main(String[] args) {
		String sDia="";
		String sMes="";
		String linea= "";
		String[] mes={"Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octunbre, Noviembre, Diciembre"};
		String añoT=("mil novecientos ochenta, dos mil seis, dos mil uno, mil novecientos noventa y cuatro, dos mil 7");
		String numeros=("1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31");
		String[] texto={"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince",
						"dieciseis", "diecisiete","dieciocho","diescinueve","veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticino","veintiseis",
						"veintisiete","veintiocho","veintinueve","treinta","treinta y uno"};
		try {
			File archivo=new File ("C:\\Users\\Jorge Alejandro\\Desktop\\fichero.txt");
			FileReader fr=new FileReader (archivo);
			BufferedReader buffer = new BufferedReader(fr);
			while ((linea = buffer.readLine()) !=null) {
								
				
					if(linea.substring(0, 2).equals(numeros)); {
						sDia= texto[Integer.parseInt(linea.substring(0,2))-1];
						
						if (linea.substring(2,4).equals(numeros));
						sMes=mes[Integer.parseInt(linea.substring(2,4))-1];
						}
					System.out.println("Linea: " + linea + " " + sDia);
						
											
				}
				
					
			
			
		}catch(Exception ex) {
			System.out.println("No encontre el archivo");
			
		}
		
		}
}


