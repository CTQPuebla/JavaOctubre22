package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double dineroIns=0;
		String idProducto;
		HashMap<String, Producto> productos = new HashMap<String, Producto>();
		productos.put("01", new Producto("Sabritas", 15, 7));
		productos.put("02", new Producto("Doritos", 17, 5));
		productos.put("03", new Producto("Gansitos", 13, 8));
		productos.put("04", new Producto("Rufles de queso", 18, 4));
		productos.put("05", new Producto("Cheetos", 16, 0));
		productos.put("06", new Producto("Churrumaiz", 12, 5));
		productos.put("07", new Producto("Paquetaxo Azul", 19, 9));
		
		Maquina m = new Maquina(productos);

		do {
			while (dineroIns != -1) {
				System.out.print("Inserte dinero(-1 para terminar): ");
				dineroIns = entrada.nextDouble();
				if (dineroIns > 0) {
					m.insertarDinero(dineroIns);
					System.out.println("Ha ingresado $"+m.getDineroIns());
				}
			}
			System.out.println("Clave | Nombre | Precio");
			for (String key : productos.keySet()) {
				Producto producto=productos.get(key);
				System.out.println(key+" | "+producto.getIdProducto()+" | $"+producto.getPrecio());
			}
			
			System.out.println("Escriba la clave del producto: ");
			idProducto = entrada.next();
			
			System.out.println(m.despacharProducto(idProducto));
			dineroIns=0;

		} while (m.getError()!=0);
		System.out.println("Su cambio es de: "+m.getCambio());

		
	}
}
