package com;

import java.util.Scanner;

public class Ejercicio24F {

	public static void main(String[] args) {
		
	Scanner entrada=new Scanner(System.in);
	
		int numero=0, negativos=0, positivos=0, par=0,impar=0, sumaP=0, sumaI=0;
		for(int i=1; i<=20;i++) {
			System.out.print((i)+" ingrese un numero: ");
			numero=entrada.nextInt();
			if(numero<0) {
				negativos++;
			}else if(numero>=0) {
				positivos++;
				sumaP=sumaP+numero;
			} if(numero % 2 == 0) {
				par++;
				}else {
					impar++;
					sumaI=sumaI+numero;
				}
			}
		System.out.println("numeros negativos: "+negativos);
		System.out.println("numeros positivos: "+positivos);
		System.out.println("numeros pares: "+par);
		System.out.println("numeros impares: "+impar);
		System.out.println("suma de positivos: "+sumaP);
		System.out.println("suma de impares: "+sumaI);

}
}