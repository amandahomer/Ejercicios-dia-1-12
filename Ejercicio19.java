/**Este programa pinta una piramide.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio19 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la altura de la piramide, ¿Cuantas lineas? (1, 2, 3...): ");
		int altura = s.nextInt();
		System.out.print("Introduce el caracter de relleno de la piramide (-, $, #, &, ^...): ");
		String caracter = s.next();
		
		int planta = 1;
		int longitud = 1;
		int espacios = altura - 1;
		
		while (planta <= altura) {
			for (int i = 1; i <= espacios; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= longitud; i++) {
				System.out.print(caracter);
			}
			
			System.out.println();
			
			planta++;
			espacios--;
			longitud = longitud + 2;
		}
		
	}
}
