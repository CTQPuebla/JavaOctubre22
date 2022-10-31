/*
 * Hernandez Falcon Jorge Ivan
Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.

La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.

 */
package com;

import java.util.Scanner;

public class Ejercicio13HFJI {
	public static void main (String[] args) {
			
		Scanner sc = new Scanner(System.in);
		double donacion; 
		System.out.println("Ingrese donaci�n anual: ");
		donacion = sc.nextDouble();
		if(donacion >=10000) {
			System.out.println("La donaci�n se reparte de la siguiente forma: \n"
					+ "$"+donacion*0.3+ " se destina al centro de salud \n"
							+ "$"+donacion*0.5+ " se destina al centro de salud \n"
									+ "$"+donacion*0.2+ " se invierte en la bolsa \n");
		}else if(donacion <10000) {
			System.out.println("La donaci�n se reparte de la siguiente forma: \n"
					+ "$"+donacion*0.25+ " se destina al centro de salud \n"
							+ "$"+donacion*0.6+ " se destina al centro de salud \n"
									+ "$"+donacion*0.15+ " se invierte en la bolsa \n");
		} else {
			System.out.println("Error");
		}
	}
}
