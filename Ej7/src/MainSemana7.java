public class MainSemana7 {

    public static void main(String[] args) {
        Ejercicio7 sol = new Ejercicio7();

        // 1. Demostración de Programación Dinámica (Tribonacci)
        System.out.println("=== PROGRAMACIÓN DINÁMICA: TRIBONACCI ===");
        int nTrib = 15;

        System.out.print("1. Memoización (Top-Down): ");
        for (int i = 0; i <= nTrib; i++) {
            System.out.print(sol.tribonacci(i) + (i == nTrib ? "" : ", "));
        }

//        System.out.print("\n2. Tabulación  (Bottom-Up): ");
//        for (int i = 0; i <= nTrib; i++) {
//            System.out.print(sol.tribonacciTabulacion(i) + (i == nTrib ? "" : ", "));
//        }
//
//        System.out.println("\n\n=== BACKTRACKING: N-REINAS (4x4) ===");
//        sol.resolverNReinas(4);
    }
}