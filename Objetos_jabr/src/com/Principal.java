package com;

public class Principal {
	public static void main(String[] args) {
		
		Quesadilla q1=new Quesadilla();
		q1.setSalsa("Roja");
		q1.setBase("Harina");
		
		System.out.println(q1);
		
		Quesadilla q2=new Quesadilla("maíz", "verde");
		System.out.println(q2);
		
		//Crear objetos con los demás constructores
		
		Quesadilla q3=new Quesadilla("nopal");
		System.out.println(q3);
		
		Quesadilla q4=new Quesadilla("Maíz", "Queso", "Bandera", "Negros", "Roja", "Hass", "Frita", "De res", "Prensado", "Sin cebolla");
		System.out.println(q4);
		
		
		
		
		
		//Crear una clase nueva modelando lo que quieran
		//Crear objetos de esta nueva clase
		
		Computadora compu1 = new Computadora();
		compu1.setPantalla("Led");
		compu1.setProcesador("i3");
		
		System.out.println(compu1);
		
		Computadora compu2=new Computadora("Led", "Gamer", "Acteck");
		System.out.println(compu2);
		
		Computadora compu3=new Computadora("i5", "SSD", "8GB", "NVIDIA");
		System.out.println(compu3);
		
		Computadora compu4=new Computadora("Oled", "i9", "M.2", "16GB", "Gamer", "Gamer", "RADEON");
		System.out.println(compu4);
		
		
			
	}

}
