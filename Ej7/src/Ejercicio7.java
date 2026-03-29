public class Ejercicio7 {

    /**
     * Calcula el n-ésimo número de Tribonacci usando Programación Dinámica.
     * Casos base: T(0)=0, T(1)=0, T(2)=1.
     * @param n Índice del número de la serie.
     * @return El número de Tribonacci en la posición n.
     */
    public long tribonacci(int n) {
        // TODO: Implementar con un array de memoria (memoización)
        // 1. Crear array de tamaño n+1
        // 2. Rellenar casos base
        // 3. Iterar rellenando el resto
        Long[] memo = new Long[n+1];
        for(int i=0; i < n+1; i++){
            memo[i] = -1L;
        }
        return tribonacciaux(n, memo);
    }
    public long tribonacciaux(int n, Long[] memo) {
        // TODO: Implementar con un array de memoria (memoización)
        // 1. Crear array de tamaño n+1
        // 2. Rellenar casos base
        // 3. Iterar rellenando el resto

        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(memo[n] != -1L){
            return memo[n];
        }
        memo[n] = tribonacciaux(n-1, memo)+tribonacciaux(n-2, memo)+tribonacciaux(n-3, memo);
        return memo[n];
    }

    /**
     * Resuelve el problema de las N-Reinas (tablero 4x4) usando Backtracking.
     * Debe imprimir todas las soluciones encontradas.
     * @param n Tamaño del tablero (n x n).
     */
    public void resolverNReinas(int n) {
        // TODO: Implementar algoritmo de Backtracking
        // 1. Crear el tablero inicializado
        // 2. Función recursiva para colocar reinas por columnas
        // 3. Validar si es seguro colocar una reina en (fila, columna)
        // 4. Si se llega a la última columna, imprimir tablero (éxito)
        throw new UnsupportedOperationException("No implementado aún.");
    }
}
