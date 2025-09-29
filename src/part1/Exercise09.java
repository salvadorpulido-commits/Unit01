package part1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu edad: ");
		int edad = scanner.nextInt();
		boolean mayorEdad = edad >= 18;
		System.out.println("¿Eres mayor de edad?: " + mayorEdad);
		scanner.close();
	}
}
