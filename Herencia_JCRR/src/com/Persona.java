package com;

public class Persona {
	
	private String nombre;
	private String nacionalidad;
	private String sexo;
	
	public Persona() {
		
	}

	public Persona(String nombre, String nacionalidad, String sexo) {
		super();
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
	
	//respirar
	//comer
	//caminar
	
	public void respirar() {
		System.out.println("Respirando...");
	}
	
	public void comer() {
		System.out.println("Comiendo... ");
	}
	
	
	public void comer(String alimento) {
		System.out.println("Comiendo: "+ alimento+ "...");
	}
	
	
	public void caminar() {
		System.out.println("Caminando...");
	}
	
	

}
