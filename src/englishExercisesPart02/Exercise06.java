package englishExercisesPart02;

import java.util.Scanner;   // Importamos la clase Scanner para leer datos del usuario

public class Exercise06 {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner llamado 'sc' para leer los datos del teclado
        Scanner sc = new Scanner(System.in);
        
        // Pedimos al usuario que introduzca el número total de estudiantes
        System.out.print("Enter the total number of students: ");
        int totalStudents = sc.nextInt();   // Leemos el número total de estudiantes
        
        // Pedimos al usuario que introduzca el tamaño de cada equipo
        System.out.print("Enter the desired team size: ");
        int teamSize = sc.nextInt();   // Leemos el tamaño de cada equipo
        
        // Calculamos cuántos equipos completos se pueden formar
        int fullTeams = totalStudents / teamSize;
        
        // Calculamos cuántos estudiantes quedan sin equipo (resto de la división)
        int studentsLeft = totalStudents % teamSize;
        
        // Mostramos los resultados al usuario
        System.out.println("Number of full teams that can be formed: " + fullTeams);
        System.out.println("Number of students without a team: " + studentsLeft);
        
        // Cerramos el Scanner para liberar recursos del sistema
        sc.close();
    }
}

