import java.util.Random;

/**
 * Ejercicio 3: Análisis y Ordenación I (Benchmarking de Algoritmos).
 *
 * Objetivo: Implementar algoritmos de ordenación básicos y medir su rendimiento.
 *
 * 1. Implementar el algoritmo de la Burbuja (Bubble Sort).
 * 2. Implementar el algoritmo de Selección (Selection Sort).
 * 3. Crear una clase/método Analizador que genere arrays aleatorios de
 *    distintos tamaños (N=100, 1000, 10000) y devuelva una tabla con el
 *    tiempo de ejecución real vs. el número de comparaciones teóricas.
 */
public class Ejercicio3 {

    /**
     * Ordena un array de enteros usando el algoritmo de la Burbuja.
     *
     * @param arr Array a ordenar.
     */
    public void ordenarBurbuja(int[] arr) {
        for(int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //intercambiar
                    int valor = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = valor;
                }
            }
        }
    }

    /**
     * Genera un array de enteros aleatorios de tamaño N.
     *
     * @param n Tamaño del array.
     * @return Array con números aleatorios.
     */
    public int[] generarArrayAleatorio(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n * 10); // Valores entre 0 y N*10
        }
        return arr;
    }

    /**
     * Ordena un array de enteros usando el algoritmo de Selección.
     *
     * @param arr Array a ordenar.
     */
    public void ordenarSeleccion(int[] arr) {
        for(int j = 0; j < arr.length ; j++) {
            int mayor = j;
            for (int i = j; i < arr.length ; i++) {
                if (arr[i] > arr[mayor]) {
                    mayor = i;

                }
            }
            //intercambiar
            int valor = arr[j];
            arr[j] = arr[mayor];
            arr[mayor] = valor;
        };
    }




    /**
     * Ejecuta el benchmark para los tamaños especificados e imprime los resultados.
     *
     * @param tamanos Array con los tamaños N a probar (ej. {100, 1000, 10000}).
     */
    public void analizar(int[] tamanos) {
        System.out.printf("%-10s | %-15s | %-15s | %-25s%n", "N", "Burbuja (ms)", "Seleccion (ms)", "Comparaciones Teoricas");
        System.out.println("-------------------------------------------------------------------------");

        for (int n : tamanos) {
            int[] original = generarArrayAleatorio(n);

            // Clonamos para ordenar exactamente los mismos elementos en cada algoritmo
            int[] copiaBurbuja = original.clone();
            int[] copiaSeleccion = original.clone();

            // Medir Burbuja
            long inicioBurbuja = System.currentTimeMillis();
            ordenarBurbuja(copiaBurbuja);
            long tiempoBurbuja = System.currentTimeMillis() - inicioBurbuja;
            // Medir Selección
            long inicioSeleccion = System.currentTimeMillis();
            ordenarSeleccion(copiaSeleccion);
            long tiempoSeleccion = System.currentTimeMillis() - inicioSeleccion;
            System.out.printf("%-10d | %-15d | %-15d | %-25d%n", n, tiempoBurbuja, tiempoSeleccion, null);
        }
    }
}
