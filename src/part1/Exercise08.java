package part1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		/*
		 * *pedir nombre *pedir edad *mostrar mensaje
		 */

		// Creamos nuevo Scanner
		Scanner reader = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = reader.nextLine();
		System.out.print("Introduce tu edad: ");
		int edad = reader.nextInt();
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		reader.close();
	}
}
