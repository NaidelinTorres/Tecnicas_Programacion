public class Pelicula {
    // Atributos
    private String nombre;
    private String autor;
    private double precio;
    private boolean disponible;

    // Constructor
    public Pelicula(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.disponible = true;
    }

    // Método comprar
    public void comprar() {
        if (disponible) {
            System.out.println("Has comprado la pelicula: " + nombre);
            disponible = false;
        } else {
            System.out.println("La pelicula " + nombre + " ya fue comprada.");
        }
    }

    // Método main
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Camino hacia el terror", "Alan B. McElroy", 12.99);
        miPelicula.comprar();
        miPelicula.comprar();
    }
}
