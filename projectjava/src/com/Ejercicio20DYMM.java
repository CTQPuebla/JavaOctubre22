package com;

public class Ejercicio20DYMM {

	public static void main(String[] args) {
		
		//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. 
		//Cual ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?.
		
		double inv= 1000,intercomp = 1, inter = 1.02;
		
		for (int i = 1; i <= 12; i++) {
			
//		�	intercomp = intercomp * 1.02;
			
			inv= inv + (inv * 0.02);
		} 
			
//		System.out.println("Su cantidad final es " + intercomp * inv);
		
		System.out.println(inv);
		
	}
}
