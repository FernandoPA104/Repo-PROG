import java.util.Scanner;

public class boletin2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a distancia en millas mariñas: ");
        double millasMariñas = scanner.nextDouble();

        double metros = millasMariñas * 1852;

        System.out.println(millasMariñas + " millas mariñas son " + metros + " metros.");
    }
}
