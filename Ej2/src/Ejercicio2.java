public class Ejercicio2 {

    /**
     * Cuenta cuántas veces aparece un dígito específico en un número de forma recursiva.
     *
     * @param numero El número a analizar.
     * @param digito El dígito a buscar (0-9).
     * @return El número de ocurrencias del dígito.
     */
    public int contarDigito(int numero, int digito) {
        // TODO: Implementar recursivamente
        // Caso base: si el número es 0 (manejar también el caso inicial si el número es el dígito)
        if(numero==0){
            return 0;
        }
        int contador= 0;
        int ultimodigito = numero % 10;
        int resto = numero/10;
        if (ultimodigito == digito) {
            contador ++;
        }
        return contador + contarDigito(resto, digito);

    }

    /**
     * Determina si hay un camino de salida en un laberinto.
     * 'S' representa el inicio, 'E' la salida, '#' muros y '.' pasillos.
     *
     * @param laberinto Matriz de caracteres.
     * @param fila Fila actual.
     * @param col Columna actual.
     * @param visitado Matriz para marcar celdas ya visitadas y evitar ciclos.
     * @return true si hay salida, false en caso contrario.
     */
    public boolean haySalida(char[][] laberinto, int fila, int col, boolean[][] visitado) {
        // TODO: Implementar usando recursión simple (backtracking básico)
        // 1. Verificar límites de la matriz.
        // 2. Verificar si la celda es un muro o ya fue visitada.
        // 3. Verificar si es la salida ('E').
        // 4. Marcar como visitado.
        // 5. Intentar moverse en las 4 direcciones (arriba, abajo, izquierda, derecha).
        throw new UnsupportedOperationException("No implementado aún.");
    }
}
