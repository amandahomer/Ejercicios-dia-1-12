/**Este programa pide una base y un exponente para calcular la potencia
*AmandaNR*/
import java.util.Scanner;

public class Ejercicio14 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Para calcular la potencia, introduce la base: ");
		int base = s.nextInt();
		
		System.out.print("Introduce el exponente: ");
		int exponente = s.nextInt();
		
		int potencia = 1;
		
		if (exponente == 0) {
			potencia = 1;
		}
		
		if (exponente > 0) {
			for (int i = 0; i < exponente; i++) {
				potencia = potencia * base;
			}
		}
		
		if (exponente < 0) {
			System.out.println("Introduce numeros enteros positivos.");
		}
		
		System.out.println(base +" elevado a "+ exponente +" = "+ potencia);
	
	}
}
