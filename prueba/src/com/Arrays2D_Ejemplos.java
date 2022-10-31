package com;

public class Arrays2D_Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] fila ={{"5", "x", "9", "4", "t"},{"3","z","p","c","6"},{"8","3","f","i","7"},};
		String [][] fila2 ={{"7", "p", "4", "g", "8"},{"5","w","y","10","2"},{"4","7","v","o","6"},};
		String [][] fila3 = new String [3][5];
		String numeros2 = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
		
		for (int i = 0; i < fila.length; i++) {
			for (int j = 0; j < fila[i].length; j++) {
				if (numeros2.indexOf(fila[i][j])>=0 && numeros2.indexOf(fila2[i][j])>=0) {
					
					fila3[i][j]= Integer.toString(Integer.parseInt(fila[i][j])+Integer.parseInt(fila2[i][j]));
					
				}else {
					fila3[i][j]="0";
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < fila3.length; i++) {
			for (int j = 0; j < fila3[i].length; j++) {
				System.out.print(fila3[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
