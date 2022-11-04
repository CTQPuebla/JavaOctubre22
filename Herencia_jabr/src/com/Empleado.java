package com;

//Se realiza con la palabra extends (Herencia)
public abstract class Empleado extends Persona {
	
	double salario;
	String rfc;
	String horario;
	String jefe;
	
	public Empleado () {
		
	}

	public Empleado(double salario, String rfc, String horario, String jefe) {
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
		this.jefe = jefe;
	}
	
	//Constructor llamando al super (constructor de su clase padre)	
	public Empleado(String nombre, String nacionalidad, String sexo, double salario, String rfc, String horario,
			String jefe) {
		super(nombre, nacionalidad, sexo);
		this.salario = salario;
		this.rfc = rfc;
		this.horario = horario;
		this.jefe = jefe;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getJefe() {
		return jefe;
	}

	public void setJefe(String jefe) {
		this.jefe = jefe;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", horario=" + horario + ", jefe=" + jefe
				+ ", getNombre()=" + getNombre() + ", getNacionalidad()=" + getNacionalidad() + ", getSexo()="
				+ getSexo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public void checarEntrada() {
		System.out.println("Hola");
	}
	
	//Método abstracto - define el QUE, pero no el COMO
	public abstract void trabajar();
	

}
