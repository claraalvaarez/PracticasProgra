public class Actividad {
    private String nombre;
    private int inicio;
    private int fin;

    public Actividad(String nombre, int inicio, int fin) {
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() { return nombre; }
    public int getInicio() { return inicio; }
    public int getFin() { return fin; }

    @Override
    public String toString() {
        return nombre + " (" + inicio + "h - " + fin + "h)";
    }
}
