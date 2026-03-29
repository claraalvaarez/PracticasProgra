public class Ejercicio5 {



    /**
     * Valida que un correo electrónico tenga un formato básico correcto.
     * @param email El correo a validar.
     * @return true si es válido, false en caso contrario.
     */
    public boolean validarEmail(String email) {
        // TODO: Implementar validación de email
        if(email==null){
            return false;
        }

        if(email.length()<5){
            return false;
        }

        boolean hayArroba = false;
        boolean hayPunto = false;
        boolean arrobaAntesPunto = false;
        for(char c : email.toCharArray()) {
            if (c == '@') {
                hayArroba = true;

            }
            if (c == '.') {
                hayPunto = true;
            }
        }
        if(hayArroba && hayPunto) {
            return true;
        }
        return false;
    }

    /**
     * Valida que una contraseña cumpla con los requisitos de seguridad.
     * @param password La contraseña a validar.
     * @return true si es válida, false en caso contrario.
     */
    public boolean validarPassword(String password) {
        // TODO: Implementar validación de contraseña
        if(password==null){
            return false;
        }

        if(password.length()<10){
            return false;
        }

        boolean hayNumero = false;
        boolean hayMinuscula = false;
        for(char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hayNumero = true;
            }
            if(Character.isLowerCase(c)){
                hayMinuscula = true;
            }
        }
        if(hayNumero && hayMinuscula){
            return true;
        }
        return false;
    }

    /**
     * Valida que la edad esté dentro del rango permitido (18-120).
     * @param edad La edad a validar.
     * @return true si es válida, false en caso contrario.
     */
    public boolean validarEdad(int edad) {
        // TODO: Implementar validación de edad
        if(edad<=0){
            return false;
        }
        if(edad>100){
            return false;
        }
        return true;
    }
}