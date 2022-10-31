/*
 * Hernandez Falcon Jorge Ivan
Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:

Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.
Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.

La institución desea saber cuánto de dinero destinará a cada rubro anualmente.

 */
package com;

import java.util.Scanner;

public class Ejercicio13HFJI {
	public static void main (String[] args) {
			
		Scanner sc = new Scanner(System.in);
		double donacion; 
		System.out.println("Ingrese donación anual: ");
		donacion = sc.nextDouble();
		if(donacion >=10000) {
			System.out.println("La donación se reparte de la siguiente forma: \n"
					+ "$"+donacion*0.3+ " se destina al centro de salud \n"
							+ "$"+donacion*0.5+ " se destina al centro de salud \n"
									+ "$"+donacion*0.2+ " se invierte en la bolsa \n");
		}else if(donacion <10000) {
			System.out.println("La donación se reparte de la siguiente forma: \n"
					+ "$"+donacion*0.25+ " se destina al centro de salud \n"
							+ "$"+donacion*0.6+ " se destina al centro de salud \n"
									+ "$"+donacion*0.15+ " se invierte en la bolsa \n");
		} else {
			System.out.println("Error");
		}
	}
}
