package com;

public class Arrays2D_Ejemplos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] curp = {"Z","I","R","C","9","5","0","4","2","0","H","V","2","M","O","S","0","4"};
		String numeros = ("0,1,2,3,4,5,6,7,8,9");
		String [] letras = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String letras2 = ("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
		String [] numeros2 = {"1","2","3","4","5","6","7","8","9"};
		Object[] objeto= {"x",20,4.53,true,'z'};
		int m=9;
		for (int j = 0; j < curp.length; j++) {
			if (numeros.indexOf(curp[j])>=0) {
				
				try {
					System.out.print(numeros2[Integer.parseInt(curp[j])+1]+" ");	
					
				}catch(Exception ex) {
					
					if (Integer.parseInt(curp[j]) == 9) {
						System.out.print(numeros2[0]+" ");
					}
					if (Integer.parseInt(curp[j]+1) == 10) {
						System.out.print(numeros2[1]+" ");
					}
				}
				
			}else {
				   // System.out.print(letras2.indexOf("Z")+" ");
				
				if (curp[j].equals("Z") ) {
					
					System.out.print(letras[1]+" ");	
				}else if(curp[j].equals("Y") ){
					
					System.out.print(letras[0]+" ");	
				}else if(letras2.indexOf(curp[j])>=0) {
					System.out.print(letras[letras2.indexOf(curp[j])+2]+" ");
					
				}
				   
			
			}
		}
		

	}

}