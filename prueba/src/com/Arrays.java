package com;

public class Arrays {

	public static void main(String[] args) {
		
		// vacio
		String [] numeros = new String[10];
		numeros[0] = "5";
		numeros[1] = "x";
		numeros[2] = "3";
		numeros[3] = "t";
		numeros[4] = "q";
		numeros[5] = "7";
		numeros[6] = "3";
		numeros[7] = "p";
		numeros[8] = "x";
		numeros[9] = "15";
		
		
		//valores
		int [] numeros2 = {1,2,3,4,5,6,7,8,9};
		
	//////////////////////////////////////////////////////////////
		
		int sumatoria=0;
		
	for (int i = 0; i < numeros.length; i++) {
		
		switch (numeros[i]) {
			case "1":
				System.out.println("Uno - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 1;
				break;
			case "2":
				System.out.println("Dos - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 2;
				break;
			case "3":
				System.out.println("Tres - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 3;
				break;
			case "4":
				System.out.println("Cuatro - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 4;
				break;
			case "5":
				System.out.println("Cinco - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 5;
				break;
			case "6":
				System.out.println("Seis - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 6;
				break;
			case "7":
				System.out.println("Siete - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 7;
				break;
			case "8":
				System.out.println("Ocho - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 8;
				break;
			case "9":
				System.out.println("Nueve - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 9;
				break;
			case "10":
				System.out.println("Diez - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 10;
				break;
			case "11":
				System.out.println("Once - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 11;
				break;
			case "12":
				System.out.println("Doce - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 12;
				break;
			case "13":
				System.out.println("Trece - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 13;
				break;
			case "14":
				System.out.println("Catorce- Se encuenctra en la posicion: " + (i+1));
				sumatoria += 14;
				break;
			case "15":
				System.out.println("Quince - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 15;
				break;
			case "16":
				System.out.println("Dieciseis - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 16;
				break;
			case "17":
				System.out.println("Diecisiete - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 17;
				break;
			case "18":
				System.out.println("Dieciocho - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 18;
				break;
			case "19":
				System.out.println("Diecinueve - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 19;
				break;
			case "20":
				System.out.println("Veinte - Se encuenctra en la posicion: " + (i+1));
				sumatoria += 20;
				break;
			default:
				System.out.println("En la posicion " + (i+1) + " no hay numeros");
		}
		
	}
	
	System.out.println("La sumatoria es: " + sumatoria);
	
	////////////////////////////////////////////////////////
	
	/*// Estructura try & catch ---- Continua el programa aunque el programa tenga un error 
	  
	try {
	
	
	
	} catch (Exception ex){
	
	}
 
	 */
	/////////////////////////////////////////////////////////////
	
	/* IndexOf ----- Verifica si un elemento existe en otro, si es asi se ejecuta el codigo
	 
	String lista = "1234567890"
	
	
	if (lista.indexof(numeros[i])) >= 0 {
	
	
	
	}
	
	
	
	
	 */
	

	}

}
