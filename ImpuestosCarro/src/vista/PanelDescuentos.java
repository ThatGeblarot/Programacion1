package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDescuentos extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox cbPPago;
	private JCheckBox cbSPublico;
	private JCheckBox cbTCuenta;
	
	public PanelDescuentos() {
		setLayout( new GridLayout(2,2));
		//setPreferredSize( new Dimension(0,65));
		
		//crear el borde con titulo y color
		
		TitledBorder border = BorderFactory.createTitledBorder("Descuentos");
		border.setTitleColor(Color.BLUE);
		setBorder( border);
		
		//instanciar cada objeto tipo checkbox de los atributos definidos
		
		cbPPago = new JCheckBox("Pronto Pago");
		cbSPublico = new JCheckBox("Servicio Publico");
		cbTCuenta = new JCheckBox("Traslado Cuenta");
		
		//agregar cada objeto al grid, segùn el orden que se escribe cada instrucción
		//add(ejemplo);
		add(cbPPago);
		add(cbTCuenta);
		add(cbSPublico);
	}

}
