package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		/*Cuenta c1 = new Cuenta("jose", "1", 12000, "1234", 3000,6000, "chida");
		Cuenta c2 = new Cuenta("pedro", "2", 12000, "1234", 3000,6000, "chida");
		
		
		cuentas.put(c1.getNum_cuenta(), c1);
		cuentas.put(c2.getNum_cuenta(), c2);
		
		
		ca1.buscarCuenta("1");
		

		ca1.retirar("1", 4000.00, "1234");
		ca1.retirar("2", 4000.00, "1234");
		
		
		for (Map.Entry<String, Cuenta> entrada : cuentas.entrySet()) {
			
			String clave= entrada.getKey();
			
			//System.out.println("Clave " + clave );
			if(entrada.getKey().equals(c2.getNum_cuenta())) {
				System.out.println("amos bien");
			}
		}*/
		
		HashMap<String, Cuenta> cuentas = new HashMap<String, Cuenta>();
		
		
		cuentas.put("1", new Cuenta("jose", "1", 12000, "1234", 500,50000, "debito"));
		cuentas.put("2", new Cuenta("pedro", "2", 45000, "4534", 500,300000, "credito"));
		cuentas.put("3", new Cuenta("pablo", "3", 56000, "5643", 500,30000, "debito"));
		cuentas.put("4", new Cuenta("rosa", "4", 67000, "6332", 500,3000, "credito"));
		
		Cajero ca1 = new Cajero("Av. Jaurez zona Esmeralda", cuentas);
		
		ca1.buscarCuenta("1");
		ca1.retirar("1", 40.00, "1234");
		
		ca1.buscarCuenta("2");
		
		ca1.depositar("2", 500);
		
		ca1.buscarCuenta("2");
		System.out.println(ca1.retirar("3", 200, "5643"));
		
		ca1.transferir("1", "2", 200);

	}

}
