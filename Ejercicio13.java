/**Este programa lee 10 numeros y determina cuantos son positivos y 
*cuantos son negativos.
*AmandaNR*/

public class Ejercicio13 {

	public static void main (String [] args) {
	
	System.out.println("Introduce 10 numeros seguidos de un INTRO: ");
	
	int positivo = 0;
	int negativo = 0;
	
	for (int i = 0; i < 10; i++) {
		if (Integer.parseInt(System.console().readLine()) < 0) {
			negativo++;
		} else {
			positivo++;
		}
	}
			
	System.out.println("Numeros positivos: "+ positivo +", numeros negativos: "+ negativo);
	
	}
}

