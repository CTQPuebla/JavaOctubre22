package com;

public class RAM_hfji {
	
		
		int tama�o;
		String fabricante;
		double frecuencia;
		String tipo;

		public RAM_hfji() {
			
			
		}

		public RAM_hfji(int tama�o, String fabricante, double frecuencia, String tipo) {
			super();
			this.tama�o = tama�o;
			this.fabricante = fabricante;
			this.frecuencia = frecuencia;
			this.tipo = tipo;
		}

		public int getTama�o() {
			return tama�o;
		}

		public void setTama�o(int tama�o) {
			this.tama�o = tama�o;
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
			return "RAM_hfji [tama�o=" + tama�o + ", fabricante=" + fabricante + ", frecuencia=" + frecuencia
					+ ", tipo=" + tipo + "]";
		}
		
		
}
