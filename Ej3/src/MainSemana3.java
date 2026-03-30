public class MainSemana3 {
    public static void main(String[] args) {
        Ejercicio3 solucion = new Ejercicio3();

        System.out.println("--- Benchmarking de Algoritmos de Ordenacion ---");

        // Tamaños a evaluar: 100, 1000, 10000.
        // Añado 50000 para notar mejor la diferencia.
        // Burbuja suele ser notablemente más lento por el número de intercambios.
        int[] tamanos = {100, 1000, 10000, 50000};
        //int[] tamanos = {5};


        solucion.analizar(tamanos);
    }
}