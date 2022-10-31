package com;

import java.util.Scanner;

public class Ejercicio14MARB {
	//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
	//Si trabaja 40 horas o menos se le paga $16 por hora. 
	//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double horas_trabajadas, salario;
        System.out.print("Ingresa el valor de horas trabajadas: ");
        horas_trabajadas = in.nextDouble();
        in.nextLine();
        salario=horas_trabajadas*16;
        if(horas_trabajadas>40)
            salario=salario+(horas_trabajadas-40)*20;
        System.out.println("Valor de salario: " + salario);
    }

}
     

