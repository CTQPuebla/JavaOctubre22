package com;

public class NavajaSuiza {
	
	String color;
	double peso;
	double tamaño;
	String funda;
	
	Navaja nav;
	Destapador dest;
	Desarmador desa;
	Tijeras tij;
	
	public NavajaSuiza() {
		
	}

	public NavajaSuiza(String color, double peso, double tamaño, String funda, Navaja nav, Destapador dest,
			Desarmador desa, Tijeras tij) {
		this.color = color;
		this.peso = peso;
		this.tamaño = tamaño;
		this.funda = funda;
		this.nav = nav;
		this.dest = dest;
		this.desa = desa;
		this.tij = tij;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getFunda() {
		return funda;
	}

	public void setFunda(String funda) {
		this.funda = funda;
	}

	public Navaja getNav() {
		return nav;
	}

	public void setNav(Navaja nav) {
		this.nav = nav;
	}

	public Destapador getDest() {
		return dest;
	}

	public void setDest(Destapador dest) {
		this.dest = dest;
	}

	public Desarmador getDesa() {
		return desa;
	}

	public void setDesa(Desarmador desa) {
		this.desa = desa;
	}

	public Tijeras getTij() {
		return tij;
	}

	public void setTij(Tijeras tij) {
		this.tij = tij;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [color=" + color + ", peso=" + peso + ", tamaño=" + tamaño + ", funda=" + funda + ", nav="
				+ nav + ", dest=" + dest + ", desa=" + desa + ", tij=" + tij + "]";
	}
	
	

}
