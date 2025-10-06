package englishExercisesPart02;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos del usuario

public class Exercise04 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner llamado 'sc' para leer datos del teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca el valor en libras
        System.out.print("Enter the value in pounds: ");
        double pounds = sc.nextDouble();   // Guardamos el valor en una variable de tipo double
        
        // Convertimos libras a kilos dividiendo entre 2.2 (ya que 1 kilo = 2.2 libras)
        double kilos = pounds / 2.2;
        
        // Mostramos el resultado en pantalla
        System.out.println(pounds + " pounds are equivalent to " + kilos + " kilos.");
        
        // Cerramos el Scanner para liberar los recursos del sistema
        sc.close();
    }
}

