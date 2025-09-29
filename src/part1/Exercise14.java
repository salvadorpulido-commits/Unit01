package part1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nota primer trimestre: ");
		int nota1 = scanner.nextInt();
		System.out.print("Nota segundo trimestre: ");
		int nota2 = scanner.nextInt();
		System.out.print("Nota tercer trimestre: ");
		int nota3 = scanner.nextInt();

		int mediaEntera = (nota1 + nota2 + nota3) / 3;
		double mediaDecimal = (nota1 + nota2 + nota3) / 3.0;

		System.out.println("Media boletín (entera): " + mediaEntera);
		System.out.println("Media expediente (decimal): " + mediaDecimal);

		scanner.close();
	}
}
