package com;

public class Ejercicio_CURP {

	public static void main(String[] args) {

		String [] CURP = {"B","A","M","N","9","9","0","1","2","2","H","D","F","R","R","Z","0","6"};
		String [] nuevo= new String[18]; 
		
		
		String numeros = ("0,1,2,3,4,5,6,7,8,9");
		String [] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String abecedario2 = ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		
		for (int i = 0; i < CURP.length; i++) {
			
			if (numeros.indexOf(CURP[i])>=0) {
				
				if(CURP[i]== "9"){
					nuevo[i] = "1";
				} else if(CURP[i]== "8"){
					
					nuevo[i] = "0";
				}else {
				
				nuevo [i] = Integer.toString(Integer.parseInt(CURP[i])+2);
				}
				
					
				}else {
					
					
					if(CURP[i] == "Y") {
						
						nuevo [i] = "A";
						
					} else if (CURP[i] == "Z") {
						nuevo [i] = "B";
					}else {
						nuevo[i] = abecedario[abecedario2.indexOf(CURP[i])+2];	
					}
				
				
				
				}
			
			}
		
		for (int j = 0; j < nuevo.length; j++) {
			System.out.print(nuevo[j]);
		}
	
		//Arreglo de cualquier cosa:

		Object [] objetos ={"x",30,45.3,'z'};
	
	
}
}






