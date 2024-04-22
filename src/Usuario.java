public class Usuario {
    private String nombre;
    private boolean esResponsable;

    public Usuario(String nombre, boolean esResponsable) {
        this.nombre = nombre;
        this.esResponsable = esResponsable;
    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsResponsable() {
        return esResponsable;
    }

    public void setEsResponsable(boolean esResponsable) {
        this.esResponsable = esResponsable;
    }
}
