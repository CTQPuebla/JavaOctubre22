package com;

import java.util.Scanner;

public class Ejercicio13cba {
	public static void main(String[] args) {
		
		//Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y 
		//lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		
		int monto;
		Scanner lector = new Scanner(System.in);
		System.out.println("ingresar monto de la donacion");
		monto = lector.nextInt();
		
		
		
		if (monto <= 10000) {
			System.out.println((monto * .30) + " destina al centro comunitario" 
					+ " " + (monto * .50) + " al comedor de ni�os"
					+ " " + (monto * .20) + " invertir en bolsa");
		
		}else {
			System.out.println((monto * .25) + " destina al centro comunitario" 
					+ " " + (monto * .60) + " al comedor de ni�os"
					+ " " + (monto * .15) + " invertir en bolsa");
		}
		
		
		
	}//fin main
	
}//fin
