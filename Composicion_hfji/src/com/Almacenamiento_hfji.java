package com;

public class Almacenamiento_hfji {
		
		String tipo;
		double capacidad;
		String marca;
		
		public Almacenamiento_hfji() {
			
			
			
		}

		public Almacenamiento_hfji(String tipo, double capacidad, String marca) {
			super();
			this.tipo = tipo;
			this.capacidad = capacidad;
			this.marca = marca;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(double capacidad) {
			this.capacidad = capacidad;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		@Override
		public String toString() {
			return "Almacenamiento_hfji [tipo=" + tipo + ", capacidad=" + capacidad + ", marca=" + marca + "]";
		}

		
		
}
