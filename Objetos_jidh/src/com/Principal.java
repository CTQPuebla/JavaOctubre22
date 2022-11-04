package com;

public class Principal {
	public static void main(String[] args) {
		
		Quesadilla q1 = new Quesadilla();
		q1.setSalsa("Roja");
		q1.setBase("Harina");
		System.out.println(q1);
		
		Quesadilla q2 = new Quesadilla("Maiz", "Verde");
			System.out.println(q2);
			
			
//	//Crear objetos con los demas constructores
//	//Crear una clase nueva, modelando lo que sea
//	//Crear objetos de la nueva clase		
	
			
		Quesadilla q3 = new Quesadilla("Maiz", "Queso", "Roja", "Si", "Si", "No", "Si", "Si", "No", "No");
			System.out.println(q3);
			
		Quesadilla q4 = new Quesadilla("Harina");
			System.out.println(q4);
			
			
			
			
			
		Hamburguesa h1 = new Hamburguesa("Normal", "Si", "No", "Si", "No", "Si", "Si", "Si", "No", "Rajas");
			System.out.println(h1);
			
		Hamburguesa h2 = new Hamburguesa("Sin pan", "No", "Si", "Si", "Si", "No", "No", "Si", "Si", "Sin salsa");
			System.out.println(h2);
			
		Hamburguesa h3 = new Hamburguesa("Si");
			System.out.println(h3);
			
		Hamburguesa h4 = new Hamburguesa("Si", "No");
			System.out.println(h4);
}
}
