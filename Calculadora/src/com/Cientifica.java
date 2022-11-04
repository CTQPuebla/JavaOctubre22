package com;

import java.util.Scanner;

//Si se quiere agregar otra interface se agrega despues de implements Interface, OtraInterface, Tercera, etc
public class Cientifica extends Calculadora implements IMedicina {
	
	boolean celdasolar;
	
	public Cientifica() {
		
	}
	
	
	public Cientifica(String precio, String tamaño, String modelo, String color, boolean celdasolar) {
		super(precio, tamaño, modelo, color);
		this.celdasolar = celdasolar;
	}
	


	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		int resultado;
		int a;
		int b;
		Scanner s=new Scanner (System.in);
		System.out.println("Introduce el primer valor");
		a=s.nextInt();
		System.out.println("Introduce el segundo valor");
		b=s.nextInt();
		
		System.out.println(resultado=Math.addExact(a, b));
		
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		int resultado;
		int a;
		int b;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el primer valor");
		a=s.nextInt();
		System.out.println("Introduce el segundo valor");
		b=s.nextInt();
		
		System.out.println(resultado=Math.subtractExact(a, b));
		
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		int resultado;
		int a;
		int b;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el primer valor");
		a=s.nextInt();
		System.out.println("Introduce el segundo valor");
		b=s.nextInt();
		
		System.out.println(resultado=Math.multiplyExact(a, b));
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		int resultado;
		int a;
		int b;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el primer valor");
		a=s.nextInt();
		System.out.println("Introduce el segundo valor");
		b=s.nextInt();
		
		System.out.println(resultado=a/b);
		
	}


	@Override
	public void cuadrado() {
		// TODO Auto-generated method stub
		double resultado;
		int a;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el valor");
		a=s.nextInt();
		
		System.out.println(resultado=a*a);
	}


	@Override
	public void exponente() {
		// TODO Auto-generated method stub
		double resultado;
		int a;
		int b;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el valor que quieres exponenciar");
		a=s.nextInt();
		System.out.println("Introduce el valor del exponente");
		b=s.nextInt();
		
		System.out.println(resultado=Math.pow(a, b));
		
	}


	@Override
	public void raiz() {
		// TODO Auto-generated method stub
		double resultado;
		int a;
		Scanner s=new Scanner (System.in);
		
		System.out.println("Introduce el valor");
		a=s.nextInt();
		
		System.out.println(resultado=Math.sqrt(a));
	}


	@Override
	public void tomarpresion() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double checarTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
