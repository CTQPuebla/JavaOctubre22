package com;

public class Quesadilla {
	
	String 		   base;
	String igrprincipal;
	String 		  salsa;
	String 		 extras;
	String       frijol;
	String    longaniza;
	String     aguacate;
	String         papa;
	String       bistec;
	String   chicharron;
	String      cebolla;
	
	//Constructur vacio
	
	public Quesadilla() {
		
	}
	
	//Construtor creado por el IDE
	// no hay limite de constructores en una clase

	public Quesadilla(String base, String igrprincipal, String salsa, String extras, String frijol, String longaniza,
			String aguacate, String papa, String bistec, String chicharron, String cebolla) {
		this.base 			= 		  base;
		this.igrprincipal 	= igrprincipal;
		this.salsa			= 		 salsa;
		this.extras 		= 		extras;
		this.frijol 		= 		frijol;
		this.longaniza 		= 	 longaniza;
		this.aguacate 		= 	  aguacate;
		this.papa 			= 		  papa;
		this.bistec 		=       bistec;
		this.chicharron 	=   chicharron;
		this.cebolla 		=      cebolla;
	}
	
	
	public Quesadilla(String base) {
		
		this.base = base;
		
	}
	
	public Quesadilla(String base, String salsa) {
		
		this.base  =  base;
		this.salsa = salsa;
		
	}
	
	
	//Setter
	
	public void setBase(String base) {
		this.base = base;
	}
	
	//Getter
	public String getBase() {
		return this.base;
	}

	
	
	
	public String getIgrprincipal() {
		return igrprincipal;
	}

	public void setIgrprincipal(String igrprincipal) {
		this.igrprincipal = igrprincipal;
	}

	public String getSalsa() {
		return salsa;
	}

	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
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
		return "Quesadilla [base=" + base + ", igrprincipal=" + igrprincipal + ", salsa=" + salsa + ", extras=" + extras
				+ ", frijol=" + frijol + ", longaniza=" + longaniza + ", aguacate=" + aguacate + ", papa=" + papa
				+ ", bistec=" + bistec + ", chicharron=" + chicharron + ", cebolla=" + cebolla + "]";
	}
	
	
	
	
}
