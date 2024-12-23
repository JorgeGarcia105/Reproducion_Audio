package modelos;

public class Video extends Audio {
    private String resolucion;
    private int duracion; // en segundos

    public Video(String titulo, String artista, String resolucion, int duracion) {
        super(titulo, artista);
        this.resolucion = resolucion;
        this.duracion = duracion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}