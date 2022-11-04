package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Producto> productos = new HashMap<String, Producto>();
		Scanner entrada = new Scanner(System.in);
		int respuesta=0;
		String codigo;
		productos.put("1", new Producto("panditas",25,"1",5));
		productos.put("2", new Producto("ruffles",20,"2",5));
		productos.put("3", new Producto("snickers",15,"3",5));
		
		Maquina_expendedora m1 = new Maquina_expendedora(productos);
		m1.Ponercredito();
		
		do {
			System.out.println("Digite el codigo del producto");
		    codigo=entrada.nextLine();
			m1.buscarProducto(codigo);
			m1.Verificacion_credito(codigo);
			m1.Mostrar_saldoactual(codigo);
			
			if(m1.getCuenta() < 15.0) {
				System.out.println("Saldo insuficiente para otra compra");
				m1.Entrega_cambio(codigo);
				respuesta=1;
				
			}else {
				System.out.println("¿Desea hacer una compra mas con su saldo actual?    0=si 1=no ");
				respuesta=entrada.nextInt();
				entrada.nextLine();
				if(respuesta==1) {
					m1.Entrega_cambio(codigo);
				}
			}
			
		}while(respuesta == 0 );
			
		
		
	}

}
