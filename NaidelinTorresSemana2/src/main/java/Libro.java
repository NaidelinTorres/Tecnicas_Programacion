public class Libro {
    protected String titulo;
    protected String autor;
    protected double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println(titulo + " de " + autor + ", Precio: $" + precio);
    }

    public static void main(String[] args) {
        LibroDigital miLibro = new LibroDigital("Crepusculo", "Stephenie Meyer", 40.49, "PDF");
        miLibro.mostrarInfo();
    }
}

// Clase hija
class LibroDigital extends Libro {
    private String formato;

    public LibroDigital(String titulo, String autor, double precio, String formato) {
        super(titulo, autor, precio);
        this.formato = formato;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Formato: " + formato);
    }
}
