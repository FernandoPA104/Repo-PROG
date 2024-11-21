
//MATRICES
//funcion que reciba dos parametros y que sea tipo tabla y el otro un valor que busque dentro de la tabla si existe ese valor si existe devuelve el indice y
//y si no devuelve -1

    public class pruebataboas {
        // Función para buscar un valor en la tabla
        public static int buscarIndice(int[] tabla, int valor) {
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i] == valor) {
                    return i; // Devuelve el índice si encuentra el valor
                }
            }
            return -1; // Devuelve -1 si no encuentra el valor
        }

        public static void main(String[] args) {
            // Ejemplo de uso
            int[] tabla = {10, 20, 30, 40, 50};
            int valor = 30;

            int indice = buscarIndice(tabla, valor);
            if (indice != -1) {
                System.out.println("El valor se encuentra en el índice: " + indice);
            } else {
                System.out.println("El valor no se encuentra en la tabla.");
            }
        }


}
