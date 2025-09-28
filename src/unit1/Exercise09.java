package unit1;

public class Exercise09 {
	
	import java.util.Scanner;

	Scanner scanner = new Scanner(System.in);
	System.out.print("Introduce tu edad: ");
	int edad = scanner.nextInt();
	boolean mayorEdad = edad >= 18;
	System.out.println("¿Eres mayor de edad?: " + mayorEdad);
	scanner.close();
	    }
	}