package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel implements ActionListener{

	//Constantes	
	public static final String LIMPIAR = "limpiar";
	public static final String CALCULAR = "calcular";
	/**
	 * constante de serialización
	 */
	private static final long serialVersionUID = 1L;

	
	//declaración de atributos
	private JLabel labTotal;
	private JTextField txtTotal;
	private JButton butLimpiar;
	private JButton butCalcular;
	

	public PanelResultados() {

		//asociar un distribuidor grafico y de las dimensiones
		setLayout( new GridLayout(2,3) );
		setPreferredSize( new Dimension(0,65));
		
		//crear el borde con titulo y color		
		TitledBorder border = BorderFactory.createTitledBorder("Resultados");
		border.setTitleColor(Color.BLUE);
		setBorder( border);
		
		//instanciar los objetos y asignar propiedades iniciales  	
		labTotal = new JLabel("Total a Pagar");
		txtTotal = new JTextField(" $ 0");
		txtTotal.setEditable(false);
		txtTotal.setForeground(Color.BLUE);
		txtTotal.setBackground(Color.WHITE);

		//boton limpiar
		butLimpiar = new JButton("Limpiar");
		butLimpiar.setActionCommand(LIMPIAR);
		//agregar acción del botón para que éste objeto la procese en método actionPerformed
		butLimpiar.addActionListener(this); 

		//boton calcular
		butCalcular = new JButton("Calcular");
		butCalcular.setActionCommand(CALCULAR);
		//agregar acción del botón para que éste objeto la procese en método actionPerformed
		butCalcular.addActionListener(this);

		
		//agregar los objetos al grid
		add (new JLabel(""));
		add (new JLabel(""));
		add(butLimpiar);
		add(labTotal);
		add(txtTotal);
		add(butCalcular);
		
	}

	//Método que responde a los eventos definidos para cada boton
	
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		String comando = evento.getActionCommand();
		
		if(comando.equals(LIMPIAR)) {
			//acciones que se toman al comando limpiar
			System.out.println("Accion limpiar");
		}
		else if(comando.equals(CALCULAR)) {
			//acciones que se toman al comando calcular
			System.out.println("Accion calcular");
		}
	}

}
