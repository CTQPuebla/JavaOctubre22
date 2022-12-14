package com;

public class Persona {

	private String nombre;
	private String nacionalidad;
	private String sexo;
	
	public Persona() {
		
		
	}

	public Persona(String nombre, String nacionalidad, String sexo) {
		
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + "]";
	}
	
	
	public void respirar () {
		System.out.println("Estoy respirando");
	}
	
	public void comer () {
		System.out.println("Estoy comiendo");
	}
	
	public void caminar () {
		System.out.println("Estoy caminando");
	}
	
	public void comer (String alimento) {
		System.out.println("Estoy comiendo " + alimento);
	}
	
	
	
	
}
