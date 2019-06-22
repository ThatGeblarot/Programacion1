package Modelo;

public class Monto {

	private int MAXIMO = 6;	
	private String unidades[] = {"cero","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	private String onceal19[] = {"diez","once","doce","trece","catrorce","quince","diez y seis","diez y siete","diez y ocho","diez y nueve"};
	private String decenas[] = {"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
	private String centenas[] = {"cien","doscientos","trescientos","cuatrocientos","quinientos","seiscientos","setecientos","ochocientos","novecientos"};
	private String miles[] = {"mil","dos mil","tres mil","cuatro mil","cinco mil","seis mil","siete mil","ocho mil","nueve mil"};
	private String diezmiles[] = {"diez mil","veinte mil","treinta mil","cuarenta mil","cincuenta mil","sesenta mil","setenta mil","ochenta mil","nueve mil"};
	private String cienmiles[] = {"cien mil","doscientos mil","trescientos mil","cuatrocientos mil","quinientos mil","seiscientos mil","setecientos mil","ochocientos mil","novecientos mil"};

	public String[] getdiezmiles() {
		return diezmiles;
	}

	public void setdiezmiles(String[] miles) {
		this.diezmiles = miles;
	}
	
	
	public String[] getcienmiles() {
		return cienmiles;
	}

	public void setcienmiles(String[] miles) {
		this.cienmiles = miles;
	}
	
	
	public String[] getmiles() {
		return miles;
	}

	public void setmiles(String[] miles) {
		this.miles = miles;
	}

	public String[] getcentenas() {
		return centenas;
	}

	public void setcentenas(String[] centenas) {
		this.centenas = centenas;
	}


	private String veinti = "veinti"; 
	private String moneda = "Pesos"; 
	private String valor;
	private int digitos[];
	private String monto;

	public Monto() {
		digitos = new int[MAXIMO];
	}
	
	public int[] getDigitos() {
		return digitos;
	}

	public void setDigitos(int[] digitos) {
		this.digitos = digitos;
	}

	
	public String[] getUnidades() {
		return unidades;
	}
	
	public void setUnidades(String[] unidades) {
		this.unidades = unidades;
	}
	
	public String[] getOnceal19() {
		return onceal19;
	}
	
	public void setOnceal19(String[] onceal19) {
		this.onceal19 = onceal19;
	}
	
	public String[] getDecenas() {
		return decenas;
	}
	
	public void setDecenas(String[] decenas) {
		this.decenas = decenas;
	}
	
	public String getVeinti() {
		return veinti;
	}
	
	public void setVeinti(String veinti) {
		this.veinti = veinti;
	}
	
	public String getMoneda() {
		return moneda;
	}
	
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}


	private boolean validarNumero(int n)
	{
		if (n >= 0 && n<= MAXIMO)
			return true;
		else
			return false;
	}
	
	public void cargarDigitos()
	{
		if(validarNumero(valor.length())) {
			for(int i=0 ; i<valor.length() ; i++) {
				digitos[MAXIMO-i-1] = (int)(valor.charAt(valor.length()-i-1)-'0');
			}
			for(int i=0 ; i<MAXIMO ; i++) 
				System.out.print(digitos[i]+"-");
		}
	}

	public String[] obtenerCifras(int digito) {
		String[] datos = new String[10];
		
		switch (digito) {
		case 0:
			datos=getcienmiles();
			break;
		case 1:
			datos=getdiezmiles();
			break;
		case 2:
			datos=getmiles();
			break;
		case 3:
			datos=getcentenas();
			break;
		}
		return datos;
	}
	
	public void calcularMonto()
	{
		String cadena = "";
		int unidad=0, decena=0;
		decena = digitos[MAXIMO-2];
		unidad = digitos[MAXIMO-1];

		for (int i=0; i<digitos.length-2 ; i++) {
			if(digitos[i] > 0) {
				cadena += obtenerCifras(i)[digitos[i]-1]+" "; 
			}
		}

/*		
		if(miles > 0)
		{
			cadena += getmiles()[digitos[MAXIMO-4]-1]+" ";
		}

		
		if(centena > 0)
		{
			cadena += getCentenas()[centena-1]+" ";
		}
*/		
		if(decena == 0)
		{
			cadena += getUnidades()[unidad];
		}
		else if (decena == 1)
		{
			cadena += getOnceal19()[unidad];
		}
		else if (decena == 2)
		{
			if (unidad == 0)
				cadena += getDecenas()[decena-2];
			else
				cadena += getVeinti() + getUnidades()[unidad];
		}
		else if (decena > 2)
		{
			if (unidad == 0)
				cadena += getDecenas()[decena-2];
			else
				cadena += getDecenas()[decena-2] + " y " +getUnidades()[unidad];
		}
		setMonto(cadena + " " + getMoneda());
	}

	public String[] getDiezmiles() {
		return diezmiles;
	}

	public void setDiezmiles(String[] diezmiles) {
		this.diezmiles = diezmiles;
	}

	public String[] getCienmiles() {
		return cienmiles;
	}

	public void setCienmiles(String[] cienmiles) {
		this.cienmiles = cienmiles;
	}

}
