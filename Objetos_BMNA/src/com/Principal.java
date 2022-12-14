package com;

public class Principal {

	public static void main(String[] args) {
	
		Quesadilla q1 = new Quesadilla();
		q1.setSalsa("Verde");
		q1.setBase("Maiz");
		System.out.println(q1);
		
		Quesadilla q2 = new Quesadilla("Harina", "Roja");
		System.out.println(q2);
		
		Quesadilla q3 = new Quesadilla("Maiz");
		System.out.println(q3);
		
		Quesadilla q4 = new Quesadilla("Maiz", "Queso oaxaca", "Verde", "No", "Si", "Si", "No", "No", "No", "No");
		System.out.println(q4);
		
		Bateria b1 = new Bateria();
		b1.setBombo("Yamaha");
		b1.setCaja("dw");
		b1.setHihat("Zildjian");
		System.out.println(b1);
		
		Bateria b2 = new Bateria("Tama", "Yamaha", "Meinl");
		System.out.println(b2);
		
		Bateria b3 = new Bateria("dw", "Tama", "Tama", "Tama", "Tama", "Zildjian", "Meinl", "Zildjian", "No");
		System.out.println(b3);
		
		
	}

}
