/**Este programa obtiene los numeros comprendidos de 7 en 7 entre dos numeros
*introducidos por teclado, validados como distintos.
*AmandaNR*/

import java.util.Scanner;

public class Ejercicio18 {

	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Introduce dos numeros enteros: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		int aux = 0;
		
		if (num1 == num2) {
			System.out.println("Los numeros introducidos deben ser distintos.");
		}
		
		if (num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		for (int i = num1; i <= num2; i = i + 7) {
			System.out.print(i +" ");
		}
	
	}
}
