package com;

public class CalculadoraCientifica extends Calculadora implements IMedicina{

	
	@Override
	public double sumar(double a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public void tomarPresion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double checarTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

}
