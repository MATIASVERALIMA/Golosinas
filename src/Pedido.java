public class Pedido {
    private String estado;
    private String tipo;

    public Pedido (String tipo){
        this.estado= null;
        this.tipo= tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void cambiarEstado(String nuevoEstado) {
        if (estado.equals("Borrador")) {
            if (nuevoEstado.equals("Pend. Aprobación")) {
                estado = nuevoEstado;
            } else {
                System.out.println("No se puede pasar de Borrador a " + nuevoEstado);
            }
        } else if (estado.equals("Pend. Aprobación")) {
            if (nuevoEstado.equals("Aprobado") || nuevoEstado.equals("Rechazado")) {
                estado = nuevoEstado;
            } else {
                System.out.println("No se puede pasar de Pend. Aprobación a " + nuevoEstado);
            }
        }
    }

    public Pedido() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
