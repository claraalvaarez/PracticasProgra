import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Ejercicio 1: Filtrado y Procesamiento de Sensores.
 *
 * Objetivo: Usar Streams para procesar una lista de lecturas de sensores.
 *
 * 1. Filtrar lecturas por un tipo específico.
 * 2. Obtener el promedio de valores de las últimas 24h.
 * 3. Encontrar la lectura con el valor máximo sin usar bucles for.
 */
public class Ejercicio1 {

    /**
     * Filtra las lecturas de sensores por un tipo específico.
     *
     * @param lecturas La lista de lecturas.
     * @param tipo El tipo de sensor a filtrar (e.g., "temperatura").
     * @return Una lista con las lecturas que coinciden con el tipo.
     */
    public List<LecturaSensor> filtrarPorTipo(List<LecturaSensor> lecturas, String tipo) {
        // TODO: Implementar usando stream().filter()
        return lecturas.stream()
                .filter(l -> l.getTipo() == tipo)
                .collect(Collectors.toList());

    }

    /**
     * Calcula el promedio de los valores de las lecturas registradas en las últimas 24 horas.
     *
     * @param lecturas La lista de lecturas.
     * @return El promedio de los valores, o 0.0 si no hay lecturas en ese rango.
     */
    public double promedioUltimas24Horas(List<LecturaSensor> lecturas) {
        // TODO: Implementar usando stream().filter().mapToDouble().average()
        // Pista: LocalDateTime.now().minusHours(24)
        return lecturas.stream()
                .filter(l -> l.getTimestamp().isAfter(LocalDateTime.now().minusHours(24)))
                .mapToDouble(l -> l.getValor())
                .average().orElse(0.0);
    }

    /**
     * Encuentra la lectura con el valor máximo.
     *
     * @param lecturas La lista de lecturas.
     * @return Un Optional conteniendo la lectura con el valor máximo, o vacío si la lista es vacía.
     */
    public Optional<LecturaSensor> encontrarMaximo(List<LecturaSensor> lecturas) {
        // TODO: Implementar usando stream().max()
        return lecturas.stream()
                .max(Comparator.comparing(LecturaSensor::getValor));

    }
}