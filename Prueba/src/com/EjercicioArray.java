package com;

public class EjercicioArray {
	
	public static void main(String[] args) {
		

		String numeros2 = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
		String[] texto = {"uno","dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte"};
		
		String numeros [] = new String [10];
		numeros[0] = "5";
		numeros[1] = "x";
		numeros[2] = "3";
		numeros[3] = "t";
		numeros[4] = "q";
		numeros[5] = "7";
		numeros[6] = "3";
		numeros[7] = "p";
		numeros[8] = "x";
		numeros[9] = "15";
		
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			
			if(numeros2.indexOf(numeros[i]) >= 0){
				suma = suma + Integer.parseInt(numeros[i]);
				
				System.out.println(texto[Integer.parseInt(numeros[i])-1]);
			}
			
		}
		
		System.out.println(suma);
		
//		int suma = 0;
//		for (int i = 0; i < numeros.length; i++) {
//			try{
//				suma = suma + Integer.parseInt(numeros[i]);
//				System.out.println(numeros[i]);
//			}catch(Exception ex) {
//				ex.printStackTrace();
//			}
//			}
		}
		
		
//		int suma = 0;
//		for (int i = 0; i < numeros.length; i++) {
//			
//			switch (numeros[i]) {
//			case "1":
//				System.out.println("Uno - Posicion " + (i+1));
//				suma += 1;
//				break;
//			case "2":
//				System.out.println("Dos - Posicion " + (i+1));
//				suma += 2;
//				break;
//			case "3":
//				System.out.println("Tres - Posicion " + (i+1));
//				suma += 3;
//				break;
//			case "4":
//				System.out.println("Cuatro - Posicion " + (i+1));
//				suma += 4;
//				break;
//			case "5":
//				System.out.println("Cinco - Posicion " + (i+1));
//				suma += 5;
//				break;
//			case "6":
//				System.out.println("Seis - Posicion " + (i+1));
//				suma += 6;
//				break;
//			case "7":
//				System.out.println("Siete - Posicion " + (i+1));
//				suma += 7;
//				break;
//			case "8":
//				System.out.println("Ocho - Posicion " + (i+1));
//				suma += 8;
//				break;	
//			case "9":
//				System.out.println("Nueve - Posicion " + (i+1));
//				suma += 9;
//				break;	
//			case "10":
//				System.out.println("Diez - Posicion " + (i+1));
//				suma += 10;
//				break;	
//			case "11":
//				System.out.println("Once - Posicion " + (i+1));
//				suma += 11;
//				break;
//			case "12":
//				System.out.println("Doce - Posicion " + (i+1));
//				suma += 12;
//				break;
//			case "13":
//				System.out.println("Trece - Posicion " + (i+1));
//				suma += 13;
//				break;
//			case "14":
//				System.out.println("Catorce - Posicion " + (i+1));
//				suma += 14;
//				break;
//			case "15":
//				System.out.println("Quince - Posicion " + (i+1));
//				suma += 15;
//				break;
//			case "16":
//				System.out.println("Dieciseis - Posicion " + (i+1));
//				suma += 16;
//				break;
//			case "17":
//				System.out.println("Diecisiete - Posicion" + (i+1));
//				suma += 17;
//				break;
//			case "18":
//				System.out.println("Dieciocho - Posicion " + (i+1));
//				suma += 18;
//				break;
//			case "19":
//				System.out.println("Dieinueve - Posicion " + (i+1));
//				suma += 19;
//				break;
//			case "20":
//				System.out.println("Veinte - Posicion " + (i+1));
//				suma += 20;
//				break;
//				
//			default:
//				System.out.println("En la posición " + (i+1) + " no hay número.");
//				break;
//			}
//			
//		}
//		
//		System.out.println("La suma de los números del arreglo es: " + suma);
		
		
		}
		
