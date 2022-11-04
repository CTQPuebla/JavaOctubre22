package com;

public class Quesadilla {

	//Atributos
	//La mayoria son privados (private)
	private String base;
	private String igrP;
	public String salsa;
	String frijol;
	String longaniza;
	String aguacate;
	String papa;
	protected String bistec;
	String chicharron;
	String cebolla;
	
	//Crea variables de clase que son estaticos (static), no cambian y son iguales para todas las instancias, a menos que sea desde el codigo o 
	//con los setters
	//Si se desea no cambiar, debe ser con el modificador final, las cuales se escriben en mayusculas
	//e igual son para todas las instancias
	private static final double precio = 30;
	
	//Constructor vacío
	public Quesadilla() {
		
				
	}
	
	public Quesadilla (String base) {
		this.base = base;
	}
	public Quesadilla (String base, String salsa) {
		this.base = base;
		this.salsa = salsa;
	}
	//No hay límite cuantos constructores agregar en una clase, depende de las necesidades
	//Constructor con todos los parámetros
	public Quesadilla(String base, String igrP, String salsa, String frijol, String longaniza, String aguacate,
			String papa, String bistec, String chicharron, String cebolla) {
		this.base = base;
		this.igrP = igrP;
		this.salsa = salsa;
		this.frijol = frijol;
		this.longaniza = longaniza;
		this.aguacate = aguacate;
		this.papa = papa;
		this.bistec = bistec;
		this.chicharron = chicharron;
		this.cebolla = cebolla;
	}
	//Setter - establece un valor en el atributo específico
	public void setBase(String base) {
		this.base=base;
		
	}
	//Getter - devuelve el valor de un atributo
	public String getBase() {
		return this.base;
	}

	public String getIgrP() {
		return igrP;
	}

	public void setIgrP(String igrP) {
		this.igrP = igrP;
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
	return "Quesadilla [base=" + base + ", igrP=" + igrP + ", salsa=" + salsa + ", frijol=" + frijol
			+ ", longaniza=" + longaniza + ", aguacate=" + aguacate + ", papa=" + papa + ", bistec=" + bistec
			+ ", chicharron=" + chicharron + ", cebolla=" + cebolla + "]";
	
	
	
}
}
