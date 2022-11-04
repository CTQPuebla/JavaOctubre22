package com;

public class NavajaSuiza {
	
	String color;
	double peso;
	double tama�o;
	String funda;
	
	Navaja nav;
	Destapador dest;
	Desarmador desa;
	Tijeras tij;
	
	public NavajaSuiza() {
		
	}

	public NavajaSuiza(String color, double peso, double tama�o, String funda, Navaja nav, Destapador dest,
			Desarmador desa, Tijeras tij) {
		this.color = color;
		this.peso = peso;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		return "NavajaSuiza [color=" + color + ", peso=" + peso + ", tama�o=" + tama�o + ", funda=" + funda + ", nav="
				+ nav + ", dest=" + dest + ", desa=" + desa + ", tij=" + tij + "]";
	}
	
	

}
