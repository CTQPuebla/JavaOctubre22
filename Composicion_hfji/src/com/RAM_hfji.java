package com;

public class RAM_hfji {
	
		
		int tamaño;
		String fabricante;
		double frecuencia;
		String tipo;

		public RAM_hfji() {
			
			
		}

		public RAM_hfji(int tamaño, String fabricante, double frecuencia, String tipo) {
			super();
			this.tamaño = tamaño;
			this.fabricante = fabricante;
			this.frecuencia = frecuencia;
			this.tipo = tipo;
		}

		public int getTamaño() {
			return tamaño;
		}

		public void setTamaño(int tamaño) {
			this.tamaño = tamaño;
		}

		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public double getFrecuencia() {
			return frecuencia;
		}

		public void setFrecuencia(double frecuencia) {
			this.frecuencia = frecuencia;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return "RAM_hfji [tamaño=" + tamaño + ", fabricante=" + fabricante + ", frecuencia=" + frecuencia
					+ ", tipo=" + tipo + "]";
		}
		
		
}
