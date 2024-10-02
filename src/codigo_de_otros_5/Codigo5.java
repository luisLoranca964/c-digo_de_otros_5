package codigo_de_otros_5;

import java.util.Scanner;

public class Codigo5 {
	public static void main(String[] args) {
		// Se agrega System.in al scanner
		Scanner s = new Scanner(System.in);
		// Se cambia a comillas dobles al final de la cadena de texto
		System.out.print("Introduzca un número: ");
		// Se cambia tipo de dato a int porque se va a trabajar con numeros y se cambia
		// a nextInt para que se guarde en la variable el int
		int num = s.nextInt();
		int c = num;

		int afo = 0;
		int noAfo = 0;

		while (num > 0) {
			int digito = num % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
			} else {
				noAfo++;
			}
			num = num/ 10;
			
		}
		if (afo > noAfo) {
			System.out.println("El " + c + " es un número afortunado.");
		} else {
			System.out.println("El " + c + " no es un número afortunado.");
		}
		//se cierra scanner
		s.close();
	}
}
