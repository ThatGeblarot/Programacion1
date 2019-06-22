package Modelo;

import java.util.Properties;

public class Pirata {
	
	private String llave;
	private String palabra;
	private Properties codigohonor; 
	
	public Pirata() {
		this.setLlave("xxx");
		this.setPalabra("yes");
		this.setCodigohonor(new Properties());
	}

	public String getLlave() {
		return llave;
	}

	public void setLlave(String llave) {
		this.llave = llave;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public Properties getCodigohonor() {
		return codigohonor;
	}

	public void setCodigohonor(Properties codigohonor) {
		this.codigohonor = codigohonor;
	}
}

