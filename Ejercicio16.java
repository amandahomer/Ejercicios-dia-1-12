/**Este programa pide un numero y dice si es primo o no.
*AmandaNR*/

public class Ejercicio16 {

	public static void main (String [] args) {
	
		System.out.print("Introduce un numero para saber si es primo: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		String esPrimo = "no es";
		
		if (numero == 0 || numero == 1 || numero == 4) {
			esPrimo = "no es";
		}
		
		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				esPrimo = "no es";
			} else {
				esPrimo = "si es";
			}
		}
	
		System.out.print("El numero introducido "+ esPrimo +" primo.");
	
	}
}
