package Principal;

import modelos.Cancion;
import modelos.Podcast;
import modelos.Video;
import modelos.Audio;
import modelos.Usuario;
import servicios.Reproductor;
import calculos.Estadisticas;
import java.util.List;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");

        // Crear audios
        Cancion cancion1 = new Cancion("Canción 1", "Artista 1", "Álbum 1", "Pop");
        Cancion cancion2 = new Cancion("Canción 2", "Artista 2", "Rock", "Rock");
        Podcast podcast1 = new Podcast("Podcast 1", "Presentador 1", "Descripción 1");
        Video video1 = new Video("Video 1", "Artista 3", "1080p", 300);

        // Reproductor
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion1);
        reproductor.reproducir(video1);

        // Estadísticas
        List<Audio> listaAudios = new ArrayList<>();
        listaAudios.add(cancion1);
        listaAudios.add(cancion2);
        listaAudios.add(podcast1);
        listaAudios.add(video1);

        Audio masReproducido = Estadisticas.masReproducido(listaAudios);
        System.out.println("Más reproducido: " + masReproducido.getTitulo());

        Audio masGustado = Estadisticas.masGustado(listaAudios);
        System.out.println("Más gustado: " + masGustado.getTitulo());

        // Usuarios y favoritos
        usuario1.agregarFavorito(cancion1);
        usuario1.agregarFavorito(video1);

        System.out.println("Favoritos de " + usuario1.getNombre() + ":");
        for (Audio audio : usuario1.getFavoritos()) {
            System.out.println("- " + audio.getTitulo());
        }
    }
}