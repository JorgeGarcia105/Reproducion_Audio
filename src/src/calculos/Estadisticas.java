package calculos;

import java.util.List;
import modelos.Audio;

public class Estadisticas {

    public static Audio masReproducido(List<Audio> lista) {
        return lista.stream()
                .max((a1, a2) -> Integer.compare(a1.getTotalReproducciones(), a2.getTotalReproducciones()))
                .orElse(null);
    }

    public static Audio masGustado(List<Audio> lista) {
        return lista.stream()
                .max((a1, a2) -> Integer.compare(a1.getClasificacion(), a2.getClasificacion()))
                .orElse(null);
    }
}