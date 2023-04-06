package operacionesAritmeticas;

import java.util.Scanner;

public class Resistencia {

	public static float pedirNumeroPositivo(int contador, Scanner input) {
		float numero;

		while (true) {
			System.out.printf("Ingrese resistencia %d: ", contador);
			String str = input.next();
			
			try {
				numero = Integer.parseInt(str);
				if (numero <= 0) {
					System.out.println("El numero debe ser positivo. Intente de nuevo.");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Ingreso invalido. Por favor ingrese un numero positivo.");
			}
		}
		return numero;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float r1 = pedirNumeroPositivo(1, input);
		float r2 = pedirNumeroPositivo(2, input);
		float r3 = pedirNumeroPositivo(3, input);

		float resistenciaTotal = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

		System.out.printf("La resistencia total es: %.2f", resistenciaTotal);
		input.close();
	}

}
