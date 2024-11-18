import java.util.Scanner;

public class boletin3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o primeiro número: ");
        short numero1 = scanner.nextShort();

        System.out.print("Introduce o segundo número: ");
        short numero2 = scanner.nextShort();

        if (numero1 >= numero2) {
            short resta = (short) (numero1 - numero2);
            System.out.println("A resta de " + numero1 + " e " + numero2 + " é: " + resta);
        }

        short suma = (short) (numero1 + numero2);
        System.out.println("A suma de " + numero1 + " e " + numero2 + " é: " + suma);
    }
}
