package com;

import java.util.Scanner;

public class Ejercicio17JABR {

	public static void main(String[] args) {
		
		
//	    Scanner sc= new Scanner(System.in);
//        System.out.println("Introduce una frase");
//        String s=sc.nextLine();
//        
//        s=s.replace(" ", "");
//        s=s.replace(",", "");
//        s=s.replace(".", "");
//        System.out.print(s);
//        int fin = s.length()-1;
//        int ini=0;
//        boolean espalin=true;
//        
//        while(ini < fin){
//            if(s.charAt(ini)!=s.charAt(fin)){
//                espalin=false;
//            }
//        ini++;
//        fin--;
//        }
//        if(espalin)
//            System.out.print("\nEs palindromo.");
//        else
//            System.out.print("\nNo es palindromo.");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Ingresa la frase");
		String original=s.nextLine();
		String reversa="";
		
		//Iterando al revés para armar la reversa
		for (int i = original.length()-1; i>=0 ; i--) {
			//System.out.println(original.charAt(i));
			reversa = reversa + original.charAt(i);
		}
		//Limpia la cadena, elimina espacios
		
		System.out.println("reversa: " + reversa.replace(" ", ""));
				
		if(original.equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palíndromo");
		}else
			System.out.println("No es palíndromo");
		

	}

}
