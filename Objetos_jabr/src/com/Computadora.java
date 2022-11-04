package com;

public class Computadora {
	
	// Atributos
		String pantalla;
		String procesador;
		String disco;
		String ram;
		String teclado;
		String mouse;
		String tarjetag;

		// Constructor vacío
		public Computadora() {

		}

		public Computadora(String pantalla, String procesador, String disco, String ram, String teclado, String mouse,
				String tarjetag) {
			this.pantalla = pantalla;
			this.procesador = procesador;
			this.disco = disco;
			this.ram = ram;
			this.teclado = teclado;
			this.mouse = mouse;
			this.tarjetag = tarjetag;
		}

		public Computadora(String procesador, String disco, String ram, String tarjetag) {
			this.procesador = procesador;
			this.disco = disco;
			this.ram = ram;
			this.tarjetag = tarjetag;
		}

		public Computadora(String pantalla, String teclado, String mouse) {
			super();
			this.pantalla = pantalla;
			this.teclado = teclado;
			this.mouse = mouse;
		}

		public String getPantalla() {
			return pantalla;
		}

		public void setPantalla(String pantalla) {
			this.pantalla = pantalla;
		}

		public String getProcesador() {
			return procesador;
		}

		public void setProcesador(String procesador) {
			this.procesador = procesador;
		}

		public String getDisco() {
			return disco;
		}

		public void setDisco(String disco) {
			this.disco = disco;
		}

		public String getRam() {
			return ram;
		}

		public void setRam(String ram) {
			this.ram = ram;
		}

		public String getTeclado() {
			return teclado;
		}

		public void setTeclado(String teclado) {
			this.teclado = teclado;
		}

		public String getMouse() {
			return mouse;
		}

		public void setMouse(String mouse) {
			this.mouse = mouse;
		}

		public String getTarjetag() {
			return tarjetag;
		}

		public void setTarjetag(String tarjetag) {
			this.tarjetag = tarjetag;
		}

		@Override
		public String toString() {
			return "Computadora [pantalla=" + pantalla + ", procesador=" + procesador + ", disco=" + disco + ", ram=" + ram
					+ ", teclado=" + teclado + ", mouse=" + mouse + ", tarjetag=" + tarjetag + "]";
		}

}
