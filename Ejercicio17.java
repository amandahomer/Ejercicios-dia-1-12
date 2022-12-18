/**Este programa pide un numero y suma los 100 numeros siguientes.
*AmandaNR*/

public class Ejercicio17 {

	public static void main (String [] args) {
		
		System.out.print("Introduce un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		int suma = 0;
		
		if (numero < 0) {
			System.out.print("Introduce un numero positivo y entero.");
		} else {
			for (int i = numero; i < numero + 100; i++) {
				suma = suma + i;
			}
			System.out.println("La suma de los 100 siguientes numeros a "+ numero +" es "+ suma);
		}
	
	}
}
