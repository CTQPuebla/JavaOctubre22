/* Hernandez Falcon Jorge Ivan
11.Dibuja un cuadrado, como en la imagen que acompaña,
introducir desde teclado el ancho y el alto.
Ejemplo: 8 x 8
*/

package com;

import java.util.Scanner;

public class Ejerciciociclico11HFJI {
      public static void main(String[]args) {
		
		int largo;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introducir tamaño de tabla ");
		largo= lector.nextInt();
		for(int j=0; j<largo; j++) {
		
			for(int i=0; i<largo; i++) {
				System.out.print("*" + "");
			}
			System.out.println("");
	}
  }
}

