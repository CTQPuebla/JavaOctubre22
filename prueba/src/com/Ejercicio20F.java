package com;

public class Ejercicio20F {

	public static void main(String[] args) {
	
		int i=1;
	    double ahorro=1000.00,total = 0,total2=0;
	   
	    while (i <= 12)
	    {
	        total =(ahorro*0.02)/100;
	       
	      System.out.println("El ahorro en el mes: "+i+
	    		  " de interes es : $"+total+" invercion "+ahorro);
	        i++;
	    }
	    total2 = total + ahorro;
	   System.out.println("EL ahorro total anual es: $"+total2*12);
	    //return 0;
	}

		
		
	}
