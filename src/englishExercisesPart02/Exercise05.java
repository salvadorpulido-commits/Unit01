package englishExercisesPart02;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos del usuario

public class Exercise05 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner llamado 'sc' para leer los datos introducidos por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca su peso en kilogramos
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();   // Guardamos el peso como número decimal (double)
        
        // Pedimos al usuario que introduzca su altura en metros
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();   // Guardamos la altura como número decimal (double)
        
        // Calculamos el BMI usando la fórmula: peso / (altura al cuadrado)
        double bmi = weight / (height * height);
        
        // Mostramos el resultado al usuario
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);
        
        // Cerramos el Scanner para liberar recursos del sistema
        sc.close();
    }
}
