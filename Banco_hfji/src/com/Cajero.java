package com;

import java.util.Date;
import java.util.HashMap;

public class Cajero {

	private String ubicacion;
	private int folio = 0;

	private HashMap<String, Cuenta> cuentas;

	public Cajero(String ubicacion, HashMap<String, Cuenta> cuentas) {
		this.ubicacion = ubicacion;
		this.cuentas = cuentas;
	}

	// Acciones

	public Cuenta buscarCuenta(String nombreCliente) {

		Cuenta cuenta = null;

		// Buscar dentro del conjunto de llaves del hashmap
		for (String key : this.cuentas.keySet()) {

			if (key.equals(nombreCliente)) {
				cuenta = this.cuentas.get(key);
				break;

			}

		}
		return cuenta;

	}

	public Ticket retirar(String nombreCliente, double monto) {
		Ticket t = null;
		if (this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);

			if (monto >= 8000) {

				System.out.println("El monto excede el maxico permitido para los retiros");
				return t;
			} else if (cuenta.getSaldoDisponible() < monto) {
				System.out.println("Fondos insuficientes");
				return t;
			} else if (cuenta.getSaldoDisponible() - monto < cuenta.getMin()) {
				System.out.println("El retiro dejaria por debajo del por debajo el minimo de  a la cuenta");
				return t;
			} else {
				// Actualizo el monto de la cuenta
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
				t = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldoDisponible(), nombreCliente,
						1);
				return t;
			}
		}
		return t;
	}

	public Ticket depositar(String nombreCliente, double monto) {
		Ticket ticket = null;
		if (this.buscarCuenta(nombreCliente) != null) {
			Cuenta cuenta = this.buscarCuenta(nombreCliente);
			if (cuenta.getSaldoDisponible() < monto) {
				System.out.println("El monto excede el maximo permitido de la cuenta");
				return ticket;
			} else if (cuenta.getSaldoDisponible() + monto > cuenta.getMax()) {
				System.out.println("El deposito excede el maximo permitido de la cuenta");
				return ticket;
			} else {
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getNumCuenta(), cuenta.getSaldoDisponible(),
						this.ubicacion, 1);
				return ticket;
			}

		} else {
			System.out.println("No hay una cuenta asociada a este Cliente");
			return ticket;

		}
	}

	public Ticket transferir(String clienteOrigen, String clienteDestino, double monto) {

		Ticket ticket = null;

		if (this.buscarCuenta(clienteOrigen) != null && this.buscarCuenta(clienteDestino) != null) {
			Cuenta origen = this.buscarCuenta(clienteOrigen);
			Cuenta destino = this.buscarCuenta(clienteDestino);
			if (origen.getSaldoDisponible()< monto) {
				System.out.println("Fondos insuficientes");
				return ticket;
			} else if (origen.getSaldoDisponible() - monto < origen.getMin()) {
				System.out.println("El returo dejaria por debajo del mismo a la cuenta");
				return ticket;
			} else if (destino.getMax() < monto) {
				System.out.println("El monto excede el maximo permitido de la cuenta");
				return ticket;
			} else {
				origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
				destino.setSaldoDisponible(origen.getSaldoDisponible() + monto);
				ticket = new Ticket(folio++, new Date(), origen.getNumCuenta(), origen.getSaldoDisponible(),
						this.ubicacion, 1);
				return ticket;
			} 
			
		} else {
			System.out.println("Alguno de los clientes no tiene cuentas asociadas");
		}
		return ticket;

	}

}
