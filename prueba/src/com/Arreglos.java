package com;

public class Arreglos {

	public static void main(String[] args) {
		
		String temporal;
		int suma=0;
		String[ ] nombre =  {"5","x","3","t","q","7","3","p", "x", "15"};//ultimaa posisin -1
		//String[] texto= {"uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince","diesiseis"};
		
		
		for (int i = 0; i < nombre.length; i++) {//recorro mi arreglo
		
		if(nombre[i].chars().allMatch(Character::isDigit)) {
		int numEntero = Integer.parseInt(nombre[i]);
		
		suma+=numEntero;
		} else {
        System.out.println(nombre[i] + " no es un número\n");
		}
		
		System.out.println("La suma total de los números es = " + suma);
		//System.out.println(texto[Integer.parseInt(nombre[i])-1]);
		
		
		
		
		
		//para crear arreglos de 2 dimensiones primero se poe la cantidada de filas y despues seria la cantidada de columnas

		}
		
		}
	}