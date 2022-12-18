/**Este programa muestra los primeros terminos de la serie de Fibonacci
* hasta el numero que se introdzca por teclado.
*AmandaNR*/

public class Ejercicio12 {
	
	public static void main (String [] args) {
	
		System.out.print("Introduce un numero por teclado: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		switch (numero) {
			case 1:
			System.out.print("0");
			case 2:
			System.out.print("0 1");
			default:
			System.out.print("0 1");
			int termino1 = 0;
			int termino2 = 1;
			int auxiliar;
			while (numero > 2) {
				auxiliar = termino1;
				termino1 = termino2;
				termino2 = auxiliar + termino2;
				System.out.print(" "+ termino2);
				numero--;
			}
		}
	
	}
}
