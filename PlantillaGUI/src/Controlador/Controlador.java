package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.InterfazGUI;

public class Controlador implements ActionListener{

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		setBd(new Mundo());
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new InterfazGUI(this);
		gui.setVisible(true); //hacer visible la ventana principal
		
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getActionCommand().equals(gui.getPanelEntrada().CONVERTIR)) {
			gui.getPanelResultados().getTxtMonto().setText(gui.getPanelEntrada().getTxtNumero().getText()+" Procesado");
		}
	}

	public Mundo getBd() {
		return bd;
	}

	public void setBd(Mundo bd) {
		this.bd = bd;
	}
}
