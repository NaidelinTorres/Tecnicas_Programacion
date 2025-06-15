public class Musica {
    // Atributos privados (encapsulados)
    private String nombre;
    private String artista;
    private double precio;
    private boolean disponible;

    // Constructor
    public Musica(String nombre, String artista, double precio) {
        this.nombre = nombre;
        this.artista = artista;
        this.precio = precio;
        this.disponible = true; // Por defecto, disponible
    }

    // Método para comprar la canción
    public void comprar() {
        if (disponible) {
            System.out.println("Has comprado la cancion: " + nombre);
            disponible = false;
        } else {
            System.out.println("La canción " + nombre + " ya fue comprada.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Artista: " + artista);
        System.out.println("Precio: " + precio + " USD");
        System.out.println("Disponible: " + (disponible ? "Si" : "No"));
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Musica miCancion = new Musica("Havana", "Camila Cabello", 10.50);

        miCancion.mostrarInfo();
        miCancion.comprar();
        miCancion.mostrarInfo();
    }
}
