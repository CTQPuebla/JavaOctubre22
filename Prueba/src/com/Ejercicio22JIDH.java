package com;

import java.util.Scanner;

public class Ejercicio22JIDH {
	
	public static void main(String[] args) {
		
	Scanner lector = new Scanner(System.in);
	int numero1;
	int numero2;
	int menor;
	int mayor;
   
    	
    	
    do {
    	 
     	 System.out.println("Introduce un n�mero entero: ");
         numero1 = lector.nextInt();
         System.out.println("Introduce otro n�mero entero distinto: ");                   
         numero2 = lector.nextInt();
        if(numero1 == numero2){
            System.out.println("Debes introducir dos n�meros distintos");
        }
    } while (numero1 == numero2);
   
    if (numero1 > numero2) {
        mayor = numero1;
        menor = numero2;
    } else {
        mayor = numero2;
        menor = numero1;
    }
   

    System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");
    for (int i = menor; i <= mayor; i++) {
        System.out.println(i);
    }
    
}

}

