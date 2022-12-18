/**Este programa muestra todas las potencias de la base introducida
*y exponente entre 1  y el exponente introducido.
*Amanda NR*/

import java.util.Scanner;

public class Ejercicio15 {

	public static void main (String [] args) {
	
	Scanner s = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		int base = s.nextInt();
		
		System.out.print("Introduce el exponente: ");
		int exponente = s.nextInt();
		
		int potencia = base * base;
		
		if (exponente == 0) {
			potencia = 1;
		}
		if (exponente > 0) {
		 for (int i = exponente; i == 1; i--) {
       potencia = exponente * base;
       System.out.println(base +" elevado a "+ i +" = "+ potencia);

     }
    }
    
    System.out.println(base +" elevado a "+ exponente +" = "+ potencia);
    
	}
}
