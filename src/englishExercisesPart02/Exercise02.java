package englishExercisesPart02;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos del teclado
import java.time.Year;      // Importamos la clase Year para obtener el año actual del sistema

public class Exercise02 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner llamado 'sc' para leer datos del teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca su edad
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();   // Guardamos la edad introducida como número entero
        
        // Obtenemos el año actual usando la clase Year del paquete java.time
        int currentYear = Year.now().getValue();
        
        // Calculamos el año de nacimiento restando la edad al año actual
        int birthYear = currentYear - age;
        
        // Mostramos el resultado en pantalla
        System.out.println("You were born in approximately: " + birthYear);
        
        // Cerramos el Scanner para liberar recursos del sistema
        sc.close();
    }
}
