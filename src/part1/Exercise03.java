package part1;
import java.util.Scanner;

public class Exercise03 {
	
    public static void main(String[] args) {
    	
    	// Crear un escáner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el año actual al usuario
        System.out.print("Introduce el año actual: ");
        
        
        int actual = scanner.nextInt();
                
        System.out.print("Introduce tu año de nacimiento: ");
        int nacimiento = scanner.nextInt();
        
        int edad = actual - nacimiento;
        
        System.out.println("Tienes " + edad + " años.");
        
        
        scanner.close();
    }
}
