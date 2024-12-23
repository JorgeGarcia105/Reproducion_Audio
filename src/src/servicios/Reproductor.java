package servicios;

import modelos.Audio;

public class Reproductor {
    public void reproducir(Audio audio) {
        System.out.println("Reproduciendo: " + audio.getTitulo() + " de " + audio.getArtista());
        audio.reproducir();
    }

    public void pausar(Audio audio) {
        System.out.println("Pausando: " + audio.getTitulo());
    }

    public void detener(Audio audio) {
        System.out.println("Deteniendo: " + audio.getTitulo());
    }
}