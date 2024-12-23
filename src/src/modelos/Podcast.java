package modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;

    // Constructor
    public Podcast(String titulo, String presentador, String descripcion) {
        super(titulo, "Desconocido");
        this.presentador = presentador;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}