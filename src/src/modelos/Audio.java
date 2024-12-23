package modelos;

public class Audio {
    private String titulo;
    private String artista;
    private int totalReproducciones;
    private int clasificacion;

    // Constructor
    public Audio(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
        this.totalReproducciones = 0;
        this.clasificacion = 0;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        if (totalReproducciones >= 0) {
            this.totalReproducciones = totalReproducciones;
        }
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        if (clasificacion >= 0) {
            this.clasificacion = clasificacion;
        }
    }

    // Métodos adicionales
    public void reproducir() {
        this.totalReproducciones++;
    }

    public void meGusta() {
        this.clasificacion++;
    }
}