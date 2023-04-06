package comparaNumeros;
import java.util.Scanner;


public class ComparaNumeros {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero:");
		n1 = input.nextInt();
		System.out.println("Ingrese el segundo numero:");
		n2 = input.nextInt();
		System.out.println("Ingrese el tercero numero:");
		n3 = input.nextInt();
		
		
		int numeroMayor = (n1 > n2) ? ((n1 > n3) ? (n1) : ((n2 > n3 ? (n2) : (n3)))) : ((n2>n3) ? n2 : n3);
		
		
		/*if(n1 > n2) {
			if(n1 > n3) {
				numeroMayor = n1;
			} else {
				numeroMayor = n3;
			}
		} else {
			if(n2 > n3) {
				numeroMayor = n2;
			} else {
				numeroMayor = n3;
			}
		}
		*/
		System.out.printf("El numero mayor es: %d", numeroMayor);
		input.close();
	}

}
