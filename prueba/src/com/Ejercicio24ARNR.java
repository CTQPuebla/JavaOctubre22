package com;

import java.util.Scanner;

public class Ejercicio24ARNR {
public static void main(String[] args) {
	
	int contador=0;
	int num=0;
	int sumP=0;
	int sumaInpar=0;
	
	Scanner sc = new Scanner(System.in);
	 while(contador<20) {
		 System.out.println("Ingresa un numero ");
		 num = sc.nextInt();
		 
		 if(num<0) {
			 System.out.println("negativo");
			 
		 }else {
			 System.out.println("positivo");
			 sumP = sumP + num;
		 }if(num%2==0) {
			 System.out.println("Es par");
			 
		 }else { System.out.println("inpar");
		 sumaInpar = sumaInpar + num;
		 }
		 contador++;
	 }
}
}
