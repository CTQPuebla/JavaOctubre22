package com;

import java.util.Scanner;

public class AregloCurp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		String curp,cifrado="",caracter="";
		int numero=0;
		boolean isnumero=false;
		
		String []num= {"1","2","3","4","5","6","7","8","9","0"};
		String[]abcdario= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[]c=new String[4];
		
		
		System.out.print("ingresa tu CURP: ");
		curp=entrada.nextLine();
		
		for(int x=0; x<curp.length();x++) {
			caracter=Character.toString(curp.charAt(x));
			for(int i=0;i<num.length;i++) {//buscando si es nuumero
				
				if(caracter.equals(num[i])) {
					numero=Integer.parseInt(caracter);
					if(numero==8) {
						numero=0;
					}else if(numero==9) {
						numero=1;
						
					}else if(numero==0) {
						
						numero=2;
						
					}else {
						numero=Integer.parseInt(caracter)+2;
					}
					cifrado=cifrado+numero;
				}
			}
			for(int w=0; w<abcdario.length;w++) {
				if(caracter.equals("Y")) {
					cifrado=cifrado+"A";
				}else if(caracter.equals("Z")) {
					cifrado=cifrado+"B";
					
				}else if(caracter.equals(abcdario[w])) {
					cifrado=cifrado+abcdario[w+2];
					
					}
				}		
			}
		System.out.println(cifrado);
		}
	}


