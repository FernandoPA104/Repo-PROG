public class boletin7_2 {
    public static void main(String[] args) {
        int[] notas ={6,4,10,5,3,5,2,6,4,6,1,9,7,6,5,8,8,10,5,3,6,7,9,2,4,6,2,1,7,8};
        int contador = 0;
        int contadorsuspenso = 0;
        int numalto = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= 5) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " alumnos aprobados");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 5) {
                contadorsuspenso++;
            }
        }
        System.out.println("Hay " + contadorsuspenso + " alumnos suspensos");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > numalto) {
                numalto = notas[i]; //actualiza el numero maximo
            }
        }
        System.out.println("la nota mas alta es " + numalto);
    }
}
