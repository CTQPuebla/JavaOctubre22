package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Base de datos de las cuentas		
		HashMap<String, Cuenta> cuentas=new HashMap<String, Cuenta>();
		
		cuentas.put("Juanito", new Cuenta("001", 3000, "9685","s", 500, 5000, "Debito"));
		cuentas.put("Laura", new Cuenta("002", 1000, "4363","u", 100, 10000, "Debito"));
		cuentas.put("Ana", new Cuenta("003", 500, "9585","hjk", 50, 15000, "Debito"));
		cuentas.put("Joel", new Cuenta("004", 4000, "9274","aaa", 200, 20000, "Debito"));
		cuentas.put("Pablo", new Cuenta("005", 200, "4758","gab", 50, 10000, "Debito"));
		cuentas.put("Omar", new Cuenta("006", 7000, "2345","fff", 1500, 20000, "Debito"));
		cuentas.put("Rosa", new Cuenta("007", 300, "6578","ghj", 200, 15000, "Debito"));
		
		Cajero cajero1=new Cajero("Av Juarez Zona Esmeralda", cuentas);
		
		//Consultando informacion de una cuenta
		
		System.out.println(cajero1.buscarCuenta("Omar"));
		
		System.out.println(cajero1.depositar("Omar", 5000));
		
		System.out.println(cajero1.buscarCuenta("Omar"));
		
		System.out.println(cajero1.retirar("Omar", 2000));
		
		System.out.println(cajero1.retirar("Laura", 200));
		
		System.out.print(cajero1.transferir("Omar", "Rosa", 4000));
	}

}
