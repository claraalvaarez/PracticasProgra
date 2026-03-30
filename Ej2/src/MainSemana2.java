

public class MainSemana2 {
    public static void main(String[] args) {
        Ejercicio2 solucion = new Ejercicio2();

        // 1. Probar Contador de Digitos
        System.out.println("--- Contador de Digitos Recursivo ---");
        int numero = 122342;
        int digito = 2;
        int ocurrencias = solucion.contarDigito(numero, digito);
        System.out.println("Numero: " + numero);
        System.out.println("Digito a buscar: " + digito);
        System.out.println("Ocurrencias: " + ocurrencias);

        // 2. Probar Laberinto
        System.out.println("\n--- Explorador de Laberintos ---");
        char[][] laberinto = {
                {'S', '.', '#', '.'},
                {'.', '.', '#', '.'},
                {'#', '.', '.', '.'},
                {'.', '.', '#', 'E'}
        };
    }
}
