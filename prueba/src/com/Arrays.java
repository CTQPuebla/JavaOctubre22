package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] numeros = new int [8];
		int [] n3 = new int [10];
		int numero=0;
		String [] n2 = {"5","x", "3", "t", "12", "7", "3", "p", "x", "15"};
		numeros[0]= 30;
		numeros[1]= 31;
		numeros[2]= 32;
		numeros[3]= 33;
		numeros[4]= 34;
		numeros[5]= 35;
		numeros[6]= 36;
		numeros[7]= 37;
		String numeros2 = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
		String [] texto= {"uno","dos","tres","cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte"};
		
		for (int i = 0; i <n2.length; i++) {*/
			
//			switch (n2[i]) {
//			case "1":
//				System.out.print("Uno");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "2":
//				System.out.println("Dos");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "3":
//				System.out.println("tres");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "4":
//				System.out.println("cuatro");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "5":
//				System.out.println("cinco");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "6":
//				System.out.println("seis");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "7":
//				System.out.println("siete");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "8":
//				System.out.println("ocho");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "9":
//				System.out.println("nueve");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "10":
//				System.out.println("Diez");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "11":
//				System.out.println("once");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "12":
//				System.out.println("doce");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "13":
//				System.out.println("trece");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "14":
//				System.out.println("catorce");
//				numero= numero+Integer.parseInt(n2[i]);
//			case "15":
//				System.out.println("quince");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "16":
//				System.out.println("dieciseis");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "17":
//				System.out.println("diecisiete");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "18":
//				System.out.println("dieciocho");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "19":
//				System.out.println("diecinueve");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			case "20":
//				System.out.println("veinte");
//				numero= numero+Integer.parseInt(n2[i]);
//				break;
//			default:
//				break;
//				
//			}
//			
//			
//			
//			
//			try {
//				numero = numero + Integer.parseInt(n2[i]); 
//			}catch (Exception ex) {
			
//			}
		/*	
			if (numeros2.indexOf(n2[i])>=0) {
				
				numero= numero + Integer.parseInt(n2[i]);
				System.out.println(texto[Integer.parseInt(n2[i])-1]);
			}
			
			
			
		}
//		
		System.out.println(numero);
//		System.out.println("la suma es "+ numero);
		*/
		
		
		/*int [] fila = {8,9,10,11,12};
		System.out.println( fila[2]);
		
		int [] fila2 = new int [6];
		
		fila[3]=20;
		fila[5]=4;*/
		
		//-------------------------------------------------------
		//ARRAYS O MATRICES de 2 o mas dimensiones
		
		Scanner entrada = new Scanner (System.in);
		String [][] fila = new String [2][2];
/*      fila[0][0] = "10";
		fila[0][1] = "11";
		fila[0][2] = "12";
		fila[0][3] = "13";
		fila[0][4] = "14";
		fila[0][5] = "15";
		fila[0][6] = "16";
		fila [1][5]= "50";*/
		
		for (int i = 0; i < fila.length; i++) {
			for (int j = 0; j < fila[i].length; j++) {
				//System.out.println(fila[i][j]);
				fila[i][j]=entrada.nextLine();
			}
		}
		
		for (int i = 0; i < fila.length; i++) {
			for (int j = 0; j < fila[i].length; j++) {
				System.out.print(fila[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
