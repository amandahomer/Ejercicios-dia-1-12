/**Este programa pinta una piramide hueca.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio20 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide, ¿Cuantas lineas? (1, 2, 3...): ");
		int altura = s.nextInt();
		System.out.print("Introduce el caracter de relleno de la piramide (-, $, #, &, ^...): ");
		String caracter = s.next();
		
		int base = 1;
		int espacios = altura - 1;
		int espaciosInternos = 0;
		int i = 0;
		
		while (base < altura) {
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			for (i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");
			}
			
			if (altura > 1) {
				System.out.print(caracter);
			}
			
			
			System.out.println();
			
			base++;
			espacios--;
			espaciosInternos = espaciosInternos + 2;
		}
		
		for (i = 1; i < (base * 2); i++) {
			System.out.print(caracter);
		}
		
	}
}
