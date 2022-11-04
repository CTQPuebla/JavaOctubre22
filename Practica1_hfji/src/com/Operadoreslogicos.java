package com;

public class Operadoreslogicos {
	public static void main (String[] args) {
		//System.out.println(m.length());
		//AND && ,OR ||,NOT !
		// f   f    t
		String m = "25 de Octubre de 2022";
		int xx = 30;
		
		if(!(m.length()<5 || xx >35 || m.equals("25 de Octubre de 2022"))) {
			System.out.println("Si");
		}else {
			System.out.println("No");
			
		}
	}

}
