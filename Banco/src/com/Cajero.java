package com;

import java.util.*;

public class Cajero {
	
	
	private String ubicacion;
	private int folio;
	
	private HashMap<String, Cuenta> cuentas;
	
	
	
	public Cajero(String ubicacion,  HashMap<String, Cuenta> cuentas) {
		
		this.ubicacion = ubicacion;
		this.cuentas = cuentas;
	}
	
	//Acciones
	
	public Cuenta buscarCuenta(String numCliente) {
		
		Cuenta cuenta = null;
		
		//Busca dentro del conjunto de llaves del hashmap
		
		for (String key : this.cuentas.keySet()) {
			
			if(key.equals(numCliente)) {
				cuenta = this.cuentas.get(key);
				break;
			}
			
		}
		return cuenta;
		
	}
	
	public Ticket retirar(String numCliente, double monto, String nip) {
		
		Ticket t1 = null;
		
		if(this.buscarCuenta(numCliente) != null) {
			
			
			Cuenta cuenta = this.buscarCuenta(numCliente);
			
			if(monto > 8000) {
				System.out.println("Excedente en el limite de retiro, retiro minimo= 4000");
				return t1;
			}else if (monto> cuenta.getSaldo()) {
				
				System.out.println("Fondos insuficientes, tu saldo actual es de" + cuenta.getSaldo());
				return t1;
			}else if(cuenta.getSaldo()-monto < cuenta.getMin()) {
				
				System.out.println("El retiro dejaria por debajo el minimo a la cuenta");
				return t1;
			}else {
				
				//actualizo el monto de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				t1 = new Ticket(new Date(),cuenta.getNum_cuenta(),cuenta.getSaldo(),this.ubicacion,1,folio++);
				
				System.out.println(t1);
				return t1;
			}
			
			
		}else {
			
			 System.out.println("No hay una cuenta asociada ese cliente");
			 return t1;
		}

		
		
	}
	
	
	
	public Ticket depositar (String numCliente, double monto) {
		
		Ticket t1 = null;
		
		if(this.buscarCuenta(numCliente) != null) {
			
			
			Cuenta cuenta = this.buscarCuenta(numCliente);
			
			if(cuenta.getMax() < monto) {
				System.out.println("Excedente en el limite de deposito de la cuenta");
				return t1;
			}else if (monto> cuenta.getSaldo()) {
				
				System.out.println("Fondos insuficientes, tu saldo actual es de" + cuenta.getSaldo());
				return t1;
			}else if(cuenta.getSaldo()+monto > cuenta.getMax()) {
				
				System.out.println("El deposito dejaria por arriba el maximo a la cuenta");
				return t1;
			}else {
				
				//actualizo el monto de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				t1 = new Ticket(new Date(),cuenta.getNum_cuenta(),cuenta.getSaldo(),this.ubicacion,1,folio++);
				System.out.println(t1);
				return t1;
			}
			
			
		}else {
			
			 System.out.println("No hay una cuenta asociada ese cliente");
			 return t1;
		}
	
		
	}
	
	
	
	
	
	public Ticket transferir (String clienteOrigen, String clienteDestino, double monto) {
		
		Ticket t1 = null;
		if (this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino)!= null ) {
			
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			
			
			
			if (monto> origen.getSaldo()) {
				
				System.out.println("Fondos insuficientes, tu saldo actual es de" + origen.getSaldo());
				return t1;
			}else if(origen.getSaldo()-monto < origen.getMin()) {
				
				System.out.println("El retiro dejaria por debajo el minimo a la cuenta");
				return t1;
			}else if(origen.getMax() < monto) {
				System.out.println("Excedente en el limite de deposito de la cuenta");
				return t1;
			}else if (monto> origen.getSaldo()) {
				
				System.out.println("Fondos insuficientes, tu saldo actual es de" + origen.getSaldo());
				return t1;
			}else if(origen.getSaldo()+monto > origen.getMax()) {
				
				System.out.println("El deposito dejaria por arriba el maximo a la cuenta");
				return t1;
			
			}else {
				
				origen.setSaldo(origen.getSaldo()-monto);
				destino.setSaldo(destino.getSaldo()+monto);
				
				t1 = new Ticket(new Date(),origen.getNum_cuenta(),origen.getSaldo(),this.ubicacion,1,folio++);
				System.out.println(t1);
				return t1;
				
			
			}
			
			
		}else {
			
			System.out.println("Alguno de los cliente no tiene cuentas asociadas");
			return t1;
		}
		
		
		
	}
	
	
	
	

}
