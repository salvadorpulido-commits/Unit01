package unit1;

import java.util.Scanner;

public class Exercise10 {
	
	public static void main(String[] args) {
		/*
		 * 1 Pedir un numero al usuario
		 * compuebo si es par
		 * imprimo el mensaje
		 */
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		int numero;
		boolean esPar;
		
		// Pedimos un numero al usuario
		System.out.println("introduzca su numero");
		numero = reader.nextInt();
		
		// Comprobamos si el numero es par
		esPar = numero%2 == 0;
		
		// Imprimimos si el nuemro es par o impar
		System.out.println("El numero es par" + esPar);
	    // Cerramos el scanner
		reader.close();
		
		
		
				
	}
}
