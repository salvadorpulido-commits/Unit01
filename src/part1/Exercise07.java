package part1;

import java.util.Scanner;

public class Exercise07 {
	
	public static void main(String[] args) {
	
		/*
		 * *pedir nombre
		 * *pedir direccion
		 * *pedir telefono
		 */

		Scanner reader = new Scanner(System.in);
		String nombre;
		String direccion;
		String telefono;
		
		System.out.println("Introduzca su nombre");
		nombre = reader.nextLine();
		
		System.out.println("Introduzca su direccion");
		direccion = reader.nextLine();
		
		System.out.println("Introduzca su telefono");
		telefono = reader.nextLine();
				
		
		
	}
}
