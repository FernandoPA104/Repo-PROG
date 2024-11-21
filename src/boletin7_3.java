public class boletin7_3 {
    public static void main(String[] args) {
        int[] notas ={6,4,10,5,3,5,2,6,4,6,1,9,7,6,5,8,8,10,5,3,6,7,9,2,4,6,2,1,7,8}; //declaramos array notas
        int contador = 0; // declaramos la variable que recoge el valor que da el bucle que cuenta los alumnos aprobados
        int contadorsuspenso = 0; // declaramos la variable que recoge el valor que da el bucle que cuenta los alumnos suspensos
        int numalto = 0; //declaramos la variable que recoge el valor que da el bucle que recoge el numero mas alto
        String[] alumnos ={"Juan","Fernando","Lucia","Manuel","Luis","Carlos","Ernesto","David","Pedro","Miguel","Pablo","Jorge","Paula","Sara","Arnau","Monica","Angel","Bruno","Jaime","Nacho","Lorena","Lola","Pepe","Dani","Andrea","Claudia","Jose","Irene","Abraham","Paco"};
        // declaramos el array String con los nombres

        //bucle que cuenta los alumnos aprobados
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] <= 5) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " alumnos aprobados");

        //bucle que cuenta los alumnos suspensos
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 5) {
                contadorsuspenso++;
            }
        }
        System.out.println("Hay " + contadorsuspenso + " alumnos suspensos");

        //bucle que recoge la nota mas alta
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > numalto) {
                numalto = notas[i]; //actualiza el numero maximo
            }
        }
        System.out.println("la nota mas alta es " + numalto);
        System.out.println("la nota de " + alumnos[5] + " es " + notas[5]);


        //bucle que si las notas son mayor que 5 imprime el nombre del alumno + la nota que saco
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println("El alumno " + alumnos[i] + " aprobo con un: " + notas[i]);
            }
        }

    }
}
