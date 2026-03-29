import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 6: Técnicas I - Algoritmos Voraces (Greedy).
 */
public class Ejercicio6 {

    /**
     * Selecciona el máximo número de actividades que no se solapan.
     * @param actividades Lista original de actividades.
     * @return Lista de actividades seleccionadas.
     */
    public List<Actividad> planificar(List<Actividad> actividades) {
        // (Una actividad es compatible si su inicio es >= al fin de la anterior seleccionada)
        actividades.sort(Comparator.comparing(Actividad::getFin));
        List<Actividad> seleccionadas = new ArrayList<>();
        int finAnterior = 0;
        for(int i = 0; i < actividades.size(); i++) {
            Actividad actividad = actividades.get(i);
            if (finAnterior <= actividad.getInicio()) {
                seleccionadas.add(actividad);
                finAnterior = actividad.getFin();
            }
        }
        return seleccionadas;
    }
}
