package modelos;

public class MisFavoritos {

    public void adicioneFavorito(Audio audio) {
        if (audio.getClasificacion() >= 3) {
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento.");
        } else {
            System.out.println(audio.getTitulo() + " no es uno de los favoritos del momento.");
        }
    }
}