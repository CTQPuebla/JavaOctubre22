/* Hernandez Falcon Jorge Ivan
3. Realiza un programa para determinar 
si un String es palíndromo.
*/

package com;

import java.util.Scanner;

public class Ejerciciociclico3HFJI {

	public static void main (String[]args) {
		
    Scanner s =new Scanner(System.in);
	
	System.out.println("Ingresa la frase");
	
//Declarar las varibles
	String original= s.nextLine();
	String reversa="";
	//Interar al revez,para armar la reversa
	
	for(int i=original.length()-1; i>=0; i--) {
		
		System.out.println(original.charAt(i));
		
		reversa= reversa + original.charAt(i);
		
		}
	
    }
}
