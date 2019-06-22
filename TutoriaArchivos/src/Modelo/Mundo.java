package Modelo;

import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//Representa el mundo del problema: las clases y métodos que describen el problema 
//Pueden reemplazar el nombre de la clase "Mundo" por el que necesiten.

public class Mundo {

	private static final int INFORMATION_MESSAGE = 0;

	Persistencia BD;//se asocia a Mundo para que éste pueda interactuar con la data de Persistencia.
	Numero n;
	
	private File f;
	private FileWriter fw;
	private PrintWriter pw;
	private FileReader fr;
	private BufferedReader br;
	private String archivo = "tutoria.txt";
	//private String archivo = "C:\\data\\tutoria.txt";
	private String[] montos;
	
	public Mundo() {
		// TODO Auto-generated constructor stub
		montos = new String[3];
		n = new Numero();
	}

	
	public void crearMontos()
	{
		int i;
		for(i=0 ; i<3 ; i++) {
			n.solicitarNumero();
			montos[i] = n.calcularMonto();
		}
		
		escribirArchivo(montos);
	}
	

	public void leerMontos()
	{
		String texto = leerArchivo();
		JOptionPane.showMessageDialog(null, texto, "Tutoria Montos", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void escribirArchivo(String[] montos)
	{
		f = new File(archivo);
		try {
			System.out.println(f.getAbsolutePath());
			fw = new FileWriter(f,true);
			pw = new PrintWriter(fw);
			for(int i=0 ; i<montos.length ; i++)
			{
				pw.println(montos[i]);
			}
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public String leerArchivo() {
		String linea,salida;
		salida = "";
		JFileChooser directorio = new JFileChooser();
		directorio.showOpenDialog(null);
		f = directorio.getSelectedFile();
		//f = new File(archivo);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			linea = br.readLine();
			
			while(linea != null)
			{
				salida = salida + linea + "\n";
				System.out.println(linea);
				linea = br.readLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return salida;
	}


	public static int getInformationMessage() {
		return INFORMATION_MESSAGE;
	}
}
