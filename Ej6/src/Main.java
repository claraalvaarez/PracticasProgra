import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para la Semana 6: Técnicas Greedy.
 */
public class MainSemana6 {

    public static void main(String[] args) {
        // Crear un conjunto de actividades desordenadas y con solapamientos
        List<Actividad> actividades = new ArrayList<>();
        actividades.add(new Actividad("Clase Programación", 10, 12)); // X
        actividades.add(new Actividad("Reunión Proyecto", 11, 13)); // 2
        actividades.add(new Actividad("Taller Testing", 13, 15)); // 3
        actividades.add(new Actividad("Webinar Greedy", 12, 14)); // X
        actividades.add(new Actividad("Break Café", 9, 11)); // 1
        actividades.add(new Actividad("Tutoría", 15, 16)); // 4

        System.out.println("=== LISTA DE ACTIVIDADES PROPUESTAS ===");
        actividades.forEach(System.out::println);

        // Aplicar solución Greedy
        Ejercicio6 planificador = new Ejercicio6();
        List<Actividad> plan = planificador.planificar(actividades);

        System.out.println("\n=== PLANIFICACIÓN ÓPTIMA (MAX ACTIVIDADES) ===");
        plan.forEach(System.out::println);

        System.out.println("\nTotal actividades seleccionadas: " + plan.size());
    }
}