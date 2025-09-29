package unit1;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		import java.util.Scanner;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce la cantidad en pesetas: ");
		double pesetas = scanner.nextDouble();
		double euros = pesetas / 166.0;
        System.out.println("Equivale a " + euros + " euros.");
		scanner.close();
		    }
		}
