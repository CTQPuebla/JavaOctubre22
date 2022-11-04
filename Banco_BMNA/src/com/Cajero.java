package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero {

	private String ubicacion;
	private int folio;
	
	private HashMap <String, Cuenta>cuentas;
	
	
	public Cajero (String ubicacion, HashMap <String,Cuenta>cuentas) {
		this.ubicacion = ubicacion;
		this.cuentas=cuentas;
	}
	
	public Cuenta buscarcuenta (String nombrecliente) {
		Cuenta cuenta = null;
		
		for (String key:this.cuentas.keySet()) {
			
			if(key.equals(nombrecliente)) {
				cuenta = this.cuentas.get(key);
				break;
			}
			
		}
		
		return cuenta;
	}
	
	public Ticket retirar (String nombrecliente, double monto) {
		Ticket ticket = null;
		if (this.buscarcuenta(nombrecliente)!=null) {
			
			Cuenta cuenta = this.buscarcuenta(nombrecliente);
			
			if(monto>=8000) {
				System.out.println("El monto excede el maximo permitido");
			return ticket;
			} else if (cuenta.getSaldo()<monto) {
				System.out.println("Fondos insuficientes");
				return ticket;
			} else if (cuenta.getSaldo()-monto < cuenta.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			} else {
				
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumerocuenta(), cuenta.getSaldo(), this.ubicacion, 1);
			return ticket;
			}
			
			
			
			
		}else {
			
			System.out.println("No hay cuenta asociada");
			return ticket;
		}
		

	
	}
	

	public Ticket depositar (String nombrecliente, double monto) {
		
		Ticket ticket=null;
		
		
		if (this.buscarcuenta(nombrecliente)!=null) {
		Cuenta cuenta = this.buscarcuenta(nombrecliente);
		
		
		if (cuenta.getMax()<monto) {
			System.out.println("El monto excede el maximo permitido");
			return ticket;
		} else if (cuenta.getSaldo()+monto > cuenta.getMax()) {
			System.out.println("El deposito excede el maximo permitido en la cuenta");
			return ticket;
		} else {
			cuenta.setSaldo(cuenta.getSaldo()+monto);
			ticket = new Ticket(folio++, new Date(), cuenta.getNumerocuenta(), cuenta.getSaldo(), this.ubicacion, 1);
					return ticket;
		}
			
			
			
	}else {
		System.out.println("No hay cuenta asociada");
		return ticket;
	}
	
	
	
		
		
		

}
	
	
	public Ticket transferir (String clienteorigen, String clientedestino, double monto) {
		Ticket ticket = null;
		if (this.buscarcuenta(clienteorigen)!= null && this.buscarcuenta(clientedestino)!= null) {
			Cuenta origen = this.buscarcuenta(clienteorigen);
			Cuenta destino = this.buscarcuenta(clientedestino);
			
			if (origen.getSaldo()<monto) {
				System.out.println("Fondos insuficientes");
				return ticket;
			} else if (origen.getSaldo()-monto < origen.getMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			} else if (destino.getMax()<monto) {
				System.out.println("El monto excede el maximo permitido");
				return ticket;
			} else if (destino.getSaldo()+monto > destino.getMax()) {
				System.out.println("El deposito excede el maximo permitido en la cuenta");
				return ticket;}
			else {
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), origen.getNumerocuenta(), origen.getSaldo(), this.ubicacion, 1);
				
				return ticket;
			}
			
			
			
		}else {
			System.out.println("Alguno de los clientes no tiene cuentas asociadas");
		return ticket;
		}
		
	}
	
	
	
	
}
