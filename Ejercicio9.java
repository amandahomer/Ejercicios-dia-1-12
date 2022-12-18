/**Este programa pide un numero por teclado y dice cuantos digitos tiene
*AmandaNR*/

public class Ejercicio9 {

	public static void main (String [] args) {
	
		System.out.println("Introduce un numero: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		int digitos = 1;
		int numero2 = numero;
		
		while (numero > 10){
			digitos++;
			numero = numero / 10;
		}
		
		System.out.println("El numero "+ numero2 +" tiene "+ digitos +" digitos.");
	
	}
}
