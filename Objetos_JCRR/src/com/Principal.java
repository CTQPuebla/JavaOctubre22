package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Quesadilla q1 = new Quesadilla();
		Quesadilla q2 = new Quesadilla("Maiz", "Verde");
		Quesadilla q3 = new Quesadilla("Masa madre");
		Quesadilla q4 = new Quesadilla("Maiz", "Quesillo","roja", "nada", "Si", "Si", "No", "Si", "Si", "Si", "No");
		Jardin j1 = new Jardin("Pasto", "2", "secos");
		
		
		
		
		q1.setSalsa("Roja");
		q1.setBase("Harina");
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		
		System.out.println(j1);
		
		int i,j,k,n;
		
        n=3; //Modifica este parámetro si quieres
        float p= n/2f;
        for(i=1; i<(n+Math.ceil(p))-1; i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
		
		
	}

}
