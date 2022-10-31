package com;

import java.util.Scanner;

public class Ejercicio13DSL {
public static void main(String[]args) {
	Scanner entrada = new Scanner(System.in);
    //declaracion de variables
	int donacion;
	double salud;
	double comedor;
	double bolsa;
	System.out.println("Ingrese el monto de la donacion: ");
	donacion= entrada.nextInt();
	if(donacion >= 10000){
	salud = (0.30  * donacion);
	comedor = (0.50  * donacion);
	bolsa = (0.20  * donacion);
	}else{
	            salud = (0.25  * donacion);
	comedor =( 0.60  * donacion);
	bolsa = (0.15  * donacion);
	}

	System.out.println("Se le entregara al centro de salud: " + salud + " al comedor: " + comedor + " lo restante a la bolsa: " + bolsa);
	
	
	
}
}
