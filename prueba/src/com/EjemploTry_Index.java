package com;

public class EjemploTry_Index {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] numeros = new int [8];
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
			
			for (int i = 0; i <n2.length; i++) {
			//Try & catch
//				try {
//					numero = numero + Integer.parseInt(n2[i]); 
//				}catch (Exception ex) {
//				
//				}
				
				// Index Of
				if (numeros2.indexOf(n2[i])>=0) {
					
					numero= numero + Integer.parseInt(n2[i]);
					System.out.println(texto[Integer.parseInt(n2[i])-1]);
				}
				
				
				
			}
//			
			System.out.println(numero);
			
		}

	}