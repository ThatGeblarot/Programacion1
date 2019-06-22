package pascal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.print("Numero de terminos:");
		int terminos = leer.nextInt();
		Triangulo pascal = new Triangulo();
		pascal.generarTriangulo(terminos);
		leer.close();
	}
}
