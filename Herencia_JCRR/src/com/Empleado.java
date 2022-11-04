package com;

public abstract class Empleado extends Persona {
	
	private int id;
	private double sueldo;
	private String rfc;
	String jefe;
	
	
	public Empleado() {
	
		
	}
	
	

// constructor llamando al super(constructor de su clase padre)
	public Empleado(String nombre, String nacionalidad, String sexo, int id, double sueldo, String rfc, String jefe) {
		super(nombre, nacionalidad, sexo);
		this.id = id;
		this.sueldo = sueldo;
		this.rfc = rfc;
		this.jefe = jefe;
	}




	public Empleado(int id, double sueldo, String rfc, String jefe) {
		this.id = id;
		this.sueldo = sueldo;
		this.rfc = rfc;
		this.jefe = jefe;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getJefe() {
		return jefe;
	}


	public void setJefe(String jefe) {
		this.jefe = jefe;
	}



	@Override
	public String toString() {
		return "Empleado [id=" + id + ", sueldo=" + sueldo + ", rfc=" + rfc + ", jefe=" + jefe + ", getNombre()="
				+ getNombre() + ", getNacionalidad()=" + getNacionalidad() + ", getSexo()=" + getSexo() + "]";
	}



	public void ChecarEntrada() {
		
		System.out.println("Checando entrada...");
		
	}

		//Metodo abstracto  define el que pero no el como
	public abstract void trabajar();
	
	

}
