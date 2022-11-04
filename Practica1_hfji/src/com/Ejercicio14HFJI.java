/* Hernandez Falcon Jorge Ivan
Un obrero necesita calcular su salario semanal, 
el cual se obtiene de la siguiente manera: 
Si trabaja 40 horas o menos se le paga $16 por hora. 
Si trabaja más de 40 horas se le paga $16 por cada 
una de las primeras 40 horas y $20 por cada hora extra.
*/

package com;

import java.util.Scanner;

public class Ejercicio14HFJI {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int horas, salario;
	System.out.println("Ingrese las horas que trabajó: ");
	horas = sc.nextInt();
	
	if(horas <=40 && horas >=1) {
		salario = horas*16;
		System.out.println("Su salario semanal es: "+ salario +" dólares");
	}else if (horas > 40) {
		salario = 40*16 + ((horas - 40)*20);
		System.out.println("Su salario semanal es: "+ salario +" dólares");
		
	}else {
		System.out.println("No trabajó");
	}
  }
}

