/**Este programa calcula la media de un conjunto de numeros introducidos por teclado
* hasta que se introduzca un numero negativo.
*AmandaNR*/

public class Ejercicio10 {

	public static void main (String [] args) {
	
		System.out.println("Vaya introduciendo numeros y pulsando INTRO.");
		System.out.println("Para terminar, introduce un numero negativo.");
		
		double numero = 0;
		double cuentaNumeros = 0;
		double suma = 0;
		double media = 0;
		
		while (numero >= 0) {
			numero = Double.parseDouble(System.console().readLine());
			cuentaNumeros++;
			suma = suma + numero;
		}
		
		media = (suma - numero) / (cuentaNumeros - 1);
		
		System.out.println("La media de los numeros positivos introducidos es: "+ media);
		
	}
}
