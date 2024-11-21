import java.util.Random;

public class boletin7_1 {
    public static void main(String[] args) {
        //crea array de tamaño 6
        int[] numeros = new int[6];
        //genera numeros aleatoros entre 1 y 50
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1;
        }
        //array en orden
        System.out.println("Números en orden: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println(); //nueva linea
        //array del reves
        System.out.println("Números del reves: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println();
    }
}
