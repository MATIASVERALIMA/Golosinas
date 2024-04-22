public class Main {
    public static void main(String[] args) {
                // Crear instancias de Producto
                Producto producto1 = new Producto("Chocolate", "Delicioso chocolate con dulce de leche", 1.50, 100, "Chocolates");
                Producto producto2 = new Producto("Gomitas", "Sabrosas gomitas de frutas", 0.75, 200, "Caramelos");

                // Mostrar información de los productos
                System.out.println("Producto 1:");
                mostrarInformacionProducto(producto1);
                System.out.println("\nProducto 2:");
                mostrarInformacionProducto(producto2);

                // Actualizar el stock del producto1
                producto1.setStock(80);

                // Mostrar información actualizada del producto1
                System.out.println("\nStock actualizado del Producto 1:");
                mostrarInformacionProducto(producto1);

        Pedido pedido = new Pedido();
        Usuario usuario = new Usuario();

        //inicializo los atributos de pedido y usuario
        pedido.setTipo("Mayorista"); // Ejemplo de inicialización (Mayoriste, Minorista)
        pedido.setEstado("Borrador"); // Ejemplo de inicialización (Pend. Aprobación y AprobadoRechazado)

        // Inicializar atributos del usuario si es necesario
        usuario.setNombre("Juan"); // Ejemplo de inicialización
        usuario.setEsResponsable(true); // Ejemplo de inicialización

        // Simulacion del proceso de enviar el pedido a aprobar
        if (pedido.getEstado().equals("Borrador")) {
            System.out.println("Enviando pedido a aprobar...");
            pedido.setEstado("Pend. Aprobación");
            System.out.println("El estado del pedido ahora es: " + pedido.getEstado());
        }

        // Simulacion de la aprobación del pedido
        if (usuario.isEsResponsable() && pedido.getEstado().equals("Pend. Aprobación")) {
            System.out.println("Aprobando pedido...");
            pedido.setEstado("Aprobado");
            System.out.println("El estado del pedido ahora es: " + pedido.getEstado());
        } else {
            System.out.println("El usuario no tiene permiso para aprobar el pedido o el pedido no está en estado 'Pend. Aprobación'.");
        }
        }

    private static void mostrarInformacionProducto(Producto producto1) {
    }

}
