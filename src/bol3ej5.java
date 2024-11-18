import java.util.Scanner;

public class bol3ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce o terceiro número: ");
        int numero3 = scanner.nextInt();

        int maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);
    }
}
