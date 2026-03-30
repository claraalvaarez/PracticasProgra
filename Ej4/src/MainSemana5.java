public class MainSemana5 {

    public static void main(String[] args) {
        Ejercicio5 validador = new Ejercicio5();

        System.out.println("=== DEMOSTRACIÓN VALIDADOR DE REGISTRO ===");

        // Ejemplo de uso rápido
        String email = "alumno@universidad.es";
        String pass = "Pass12345";
        int edad = 20;

        System.out.println("Validando usuario:");
        System.out.println("- Email: " + email + " -> " + (validador.validarEmail(email) ? "OK" : "ERROR"));
        System.out.println("- Password: " + pass + " -> " + (validador.validarPassword(pass) ? "OK" : "ERROR"));
        System.out.println("- Edad: " + edad + " -> " + (validador.validarEdad(edad) ? "OK" : "ERROR"));

        System.out.println("\nNOTA: Para esta entrega, ejecute los tests unitarios en ValidadorRegistroTest.java");
    }
}