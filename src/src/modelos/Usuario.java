package modelos;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Audio> favoritos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.favoritos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Audio> getFavoritos() {
        return favoritos;
    }

    public void agregarFavorito(Audio audio) {
        favoritos.add(audio);
    }

    public void eliminarFavorito(Audio audio) {
        favoritos.remove(audio);
    }
}
