package Controlador;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador {

	@SuppressWarnings("unused")
	private Mundo bd;
	@SuppressWarnings("unused")
	private Interfaz gui;
	
	public Controlador() 
	{
		bd = new Mundo();
		gui = new Interfaz();
	}

}
