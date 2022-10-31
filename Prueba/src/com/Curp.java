package com;

public class Curp {
	
	public static void main(String[] args) {
		
		String Curp = ("D,O,H,J,9,8,0,4,0,1,H,V,Z,M,R,N,0,4");
		int [] CurpN = new int [18];
		
		for (int x=0;x<Curp.length();x++) {
			  System.out.println(Curp.charAt(x) + " = " + Curp.codePointAt(x));
			  System.out.println(Curp.replace(Curp, Curp).codePointAt(x)+2);

			  
				for (int i = 0; i < CurpN.length; i++) {
					CurpN [i] = (Curp.replace(Curp, Curp).codePointAt(x)+2);
				}
			  	
}
		for (int j = 0; j < CurpN.length; j++) {
			System.out.println(Character.toString((char) CurpN));
		}


		}
		
}

