package unit1;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la primera nota: ");
        int nota1 = scanner.nextInt();
        System.out.print("Introduce la segunda nota: ");
        int nota2 = scanner.nextInt();
        double media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
        scanner.close();
    }
}
