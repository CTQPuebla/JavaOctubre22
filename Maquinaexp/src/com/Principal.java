package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    
	String x;
	double y;
	
    HashMap<String, Producto> loc = new HashMap<String, Producto>();
    
    loc.put("A1", new Producto("Chocorrol", 16.30));
    loc.put("A2", new Producto("Donas bimbo", 25.10));
    loc.put("A3", new Producto("Bigote Tia Rosa", 18.50));
    loc.put("B1", new Producto("Sabritas naturales", 19));
    loc.put("B2", new Producto("Takis fuego", 16));
    loc.put("B3", new Producto("Palomitas ACT II caramel", 25));
    loc.put("C1", new Producto("Coca-cola", 19));
    loc.put("C2", new Producto("Pepsi", 16));
    loc.put("C3", new Producto("Dr. Peper", 25));
    
    Scanner lector = new Scanner (System.in);
    System.out.println("Ingresar codigo de producto");
    x = lector.nextLine();
    System.out.println("Ingresar monedas");
    y = lector.nextInt();
    
        
    Maquina maquina1 = new Maquina(loc);
    
    System.out.println(maquina1.despachar(x, y));  
    
  }//Fin main

}//Fin
