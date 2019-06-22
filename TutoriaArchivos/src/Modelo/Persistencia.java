package Modelo;

public class Persistencia {
	private String unidades[] = {"cero","un","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
	private String onceal19[] = {"diez","once","doce","trece","catrorce","quince","diez y seis","diez y siete","diez y ocho","diez y nueve"};
	private String decenas[] = {"veinte","treinta","cuarenta","cincuenta","sesenta","setenta","ochenta","noventa"};
	private String veinti = "veinti"; 
	private String moneda = "Euros"; 
	private String nombreApp = "Conversión de Moneda";
	
	@SuppressWarnings("unused")
	public Persistencia()
	{
		//no pongo nada. Y que?
		String nada = "";
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
	public String getNombreApp() {
		return nombreApp;
	}
	public void setNombreApp(String nombreApp) {
		this.nombreApp = nombreApp;
	}
	
	
}
