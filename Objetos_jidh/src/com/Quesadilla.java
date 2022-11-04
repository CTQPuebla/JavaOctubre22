package com;

public class Quesadilla {
	
	String base;
	String igrPrincipal;
	String salsa;
	String frijol;
	String longaniza;
	String aguacate;
	String papa;
	String bistec;
	String chicharron;
	String cebolla;
	
	//Constructor Vacío
	public Quesadilla() {
		
		
	}
	
	public Quesadilla(String base) {
		this.base = base;
	}
	
	public Quesadilla(String base, String salsa) {
		this.base = base;
		this.salsa = salsa;
	}
	
	//No hay limite de cuantos constructores agregar en una clase, depende de las necesidades
	//Constructor con todos los parametros
	public Quesadilla(String base, String igrPrincipal, String salsa, String frijol, String longaniza, String aguacate,
			String papa, String bistec, String chicharron, String cebolla) {
		this.base = base;
		this.igrPrincipal = igrPrincipal;
		this.salsa = salsa;
		this.frijol = frijol;
		this.longaniza = longaniza;
		this.aguacate = aguacate;
		this.papa = papa;
		this.bistec = bistec;
		this.chicharron = chicharron;
		this.cebolla = cebolla;
	}
	
	
	//Setter - establece un valor en el atributo especifico
	public void setBase(String base) {
		this.base = base;
	}
	
	//Getter - devuelve el valor de un atributo
	public String getBase() {
		return this.base;
	}

	public String getIgrPrincipal() {
		return igrPrincipal;
	}

	public void setIgrPrincipal(String igrPrincipal) {
		this.igrPrincipal = igrPrincipal;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getFrijol() {
		return frijol;
	}

	public void setFrijol(String frijol) {
		this.frijol = frijol;
	}

	public String getLonganiza() {
		return longaniza;
	}

	public void setLonganiza(String longaniza) {
		this.longaniza = longaniza;
	}

	public String getAguacate() {
		return aguacate;
	}

	public void setAguacate(String aguacate) {
		this.aguacate = aguacate;
	}

	public String getPapa() {
		return papa;
	}

	public void setPapa(String papa) {
		this.papa = papa;
	}

	public String getBistec() {
		return bistec;
	}

	public void setBistec(String bistec) {
		this.bistec = bistec;
	}

	public String getChicharron() {
		return chicharron;
	}

	public void setChicharron(String chicharron) {
		this.chicharron = chicharron;
	}

	public String getCebolla() {
		return cebolla;
	}

	public void setCebolla(String cebolla) {
		this.cebolla = cebolla;
	}

	
	//Radiografia
	
	@Override
	public String toString() {
		return "Quesadilla [base=" + base + ", igrPrincipal=" + igrPrincipal + ", salsa=" + salsa + ", frijol=" + frijol
				+ ", longaniza=" + longaniza + ", aguacate=" + aguacate + ", papa=" + papa + ", bistec=" + bistec
				+ ", chicharron=" + chicharron + ", cebolla=" + cebolla + "]";
	}
	
	

}
