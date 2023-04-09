package fechas;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// Solicitar al usuario dos fechas de tipo String, una después de otra de la
		// forma: "Ingrese la primera fecha como DD/MM/AAAA"
		String fecha1, fecha2;
		Scanner input = new Scanner(System.in);
		
		fecha1 = pedirFecha(0, input);
		fecha2 = pedirFecha(1, input);
		
		// Guardar cada parte de la fecha como integer, es decir, el día, mes y año.
		// Utilizar substring de la clase String
		// Calcular cuál de las dos fechas es mayor.
		compararFechas(fecha1, fecha2);
	}

	public static String pedirFecha(int contador, Scanner input) {
		String fecha;
		String regex = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/([1-9]\\d{3})$";

		while (true) {
			if (contador == 0) {
				System.out.printf("Ingrese la primera fecha como DD/MM/AAAA: ");
				String stringFecha = input.next();

				if (stringFecha.matches(regex)) {
					contador += 1;
					fecha = stringFecha;
					break;
				} else {
					System.out.println("Formato incorrecto. Use DD/MM/AAAA");
				}
			} else {
				if (contador != 0) {
					System.out.printf("Ingrese la segunda fecha como DD/MM/AAAA: ");
					String stringFecha = input.next();

					if (stringFecha.matches(regex)) {
						contador += 1;
						fecha = stringFecha;
						break;
					} else {
						System.out.println("Formato incorrecto. Use DD/MM/AAAA");
					}
				}
			}
		}
		return fecha;
	}
	public static int aplanarFecha(String fecha) {
		int dias = Integer.parseInt(fecha.substring(0,2));
		int meses = Integer.parseInt(fecha.substring(3,5)) * 30;
		int años = Integer.parseInt(fecha.substring(6));
		int totalDias = dias + meses + años;
		return totalDias;
	}
	public static void compararFechas(String fecha1, String fecha2) {
		int totalDias1 = aplanarFecha(fecha1);
		int totalDias2 = aplanarFecha(fecha2);
		if (totalDias1 == totalDias2) {
			System.out.println("Las edades son iguales.");
		} else if (totalDias1 > totalDias2) {
			System.out.println("La persona 1 es mayor.");
		} else {
			System.out.println("La persona 2 es mayor.");
		}
	}
}
	
