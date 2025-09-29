package part1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la cantidad en pesetas: ");
		double pesetas = scanner.nextDouble();
		double euros = pesetas / 166.0;
		System.out.println("Equivale a " + euros + " euros.");
		scanner.close();
	}
}
