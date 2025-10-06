package englishExercisesPart02;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos del usuario

public class Exercise03 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner llamado 'sc' para leer datos desde el teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca la longitud del rectángulo
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();   // Leemos la longitud (puede tener decimales)
        
        // Pedimos al usuario que introduzca la altura del rectángulo
        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();   // Leemos la altura (puede tener decimales)
        
        // Calculamos el área del rectángulo usando la fórmula: área = longitud × altura
        double area = length * height;
        
        // Calculamos el perímetro del rectángulo: perímetro = 2 × (longitud + altura)
        double perimeter = 2 * (length + height);
        
        // Mostramos los resultados al usuario
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        
        // Cerramos el Scanner para liberar recursos del sistema
        sc.close();
    }
}

