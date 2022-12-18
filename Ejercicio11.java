/**Este programa muestra el cuadrado y el cubo de los 5 primeros numeros 
*a partir de uno introducido por teclado.
*AmandaNR*/

public class Ejercicio11 {

	public static void main (String [] args) {
	
		System.out.print("Introduce un numero entero: ");
		int numero = Integer.parseInt(System.console().readLine());
	
		for (int i = numero; i <= (numero + 5); i++) {
			System.out.println(i +" "+ i * i +" "+ i * i * i);
		}
		
	}
}
