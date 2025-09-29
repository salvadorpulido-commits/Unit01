package part1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kilos de manzanas vendidos: ");
		double manzanas = scanner.nextDouble();
		System.out.print("Kilos de peras vendidos: ");
		double peras = scanner.nextDouble();
		double total = manzanas * 2.35 + peras * 1.95;
		System.out.println("Beneficio total: " + total + " €");
		scanner.close();
	}
}
