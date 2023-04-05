package promedioNotas;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculoDeAprobacion {
	public static double VerificarNota(double num) {
		// metodo para verificar si un double esta entre 1 y 7.
		// Si el numero esta en el rango, devuelve el numero. De lo contrario devuelve
		// 0.
		if (num >= 1 && num <= 7) {
			return num;
		} else {
			return 0;
		}
	}

	public static void PedirNumero(ArrayList<Double> notas) {
		if (notas.size() == 0) {
			System.out.println("Ingrese una nota entre 1 y 7: ");
		} else {
			System.out.println(String.format("Ingrese la siguiente nota (Notas ingresadas: %s): ", notas.size()));
		}
	}

	public static boolean SePuedePasarADouble(String input) {
		try {
			double num = Double.parseDouble(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static double CalcularPromedio(ArrayList<Double> notas) {
		System.out.println(notas);
		double suma = 0;
		for (double num : notas) {
			suma += num;
		}
		double result = suma / notas.size();
		return result;
	}

	public static void main(String[] args) {
		// ArrayList para almacenar las notas
		ArrayList<Double> notas = new ArrayList<Double>();

		// while EstaFuncionando == true
		boolean EstaFuncionando = true;
		while (EstaFuncionando == true) {
			Scanner scanner = new Scanner(System.in);
				PedirNumero(notas);				
			String input = scanner.next();
			// PedirNumero
			// if input es un numero, VerificarNota
			if (SePuedePasarADouble(input)) {
				if (VerificarNota(Double.parseDouble(input)) != 0) {
					// if VerificarNota != 0 ingresar numero
					notas.add(Double.parseDouble(input));
				}
			} else if (input.equals("ok")) {
				// else if input es un 'ok'
				// EstaFuncionando = false
				EstaFuncionando = false;
				// CalcularPromedio
				double promedio = CalcularPromedio(notas);
				System.out.println(String.format("Promedio de notas: %.2f", promedio));
				if(promedio > 4) {
					System.out.println("Enhorabuena, has aprobado!");
				} else {
					System.out.println("Buen esfuerzo, pero reprobaste :(");
				}
				scanner.close();
			} else {
				// else
				// PedirNumero
				if(notas.size() > 0) {
					PedirNumero(notas);			
				}
			}
		}
		// pruebas varias
		// System.out.println(notas.get(0));
		// System.out.println(notas.size());
		// System.out.println(VerificarNota(7.1));
		// System.out.println(VerificarNota(1));
	}

}
