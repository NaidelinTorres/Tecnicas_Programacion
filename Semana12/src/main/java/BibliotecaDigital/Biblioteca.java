/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaDigital;

/**
 *
 * @author USER
 */
import java.util.*;

public class Biblioteca {
    private final Map<String, Libro> catalogoPorIsbn;
    private final Map<String, Usuario> usuariosPorId;
    private final Set<String> isbnsPrestados;

    public Biblioteca() {
        catalogoPorIsbn = new HashMap<>();
        usuariosPorId = new HashMap<>();
        isbnsPrestados = new HashSet<>();
    }

    // Gestión de Libros
    public void anadirLibro(Libro libro) {
        if (libro == null) {
            System.out.println("No se puede añadir un libro nulo.");
            return;
        }
        catalogoPorIsbn.put(libro.getIsbn(), libro);
    }

    public void quitarLibro(String isbn) {
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("El libro está prestado, no se puede quitar.");
            return;
        }
        catalogoPorIsbn.remove(isbn);
    }

    // Gestión de Usuarios
    public void registrarUsuario(Usuario u) {
        if (u == null) {
            System.out.println("No se puede registrar un usuario nulo.");
            return;
        }
        usuariosPorId.put(u.getId(), u);
    }

    public void darBajaUsuario(String id) {
        Usuario u = usuariosPorId.get(id);
        if (u != null && !u.getIsbnsPrestados().isEmpty()) {
            System.out.println("El usuario tiene libros prestados, no se puede dar de baja.");
            return;
        }
        usuariosPorId.remove(id);
    }

    // Préstamos
    public void prestarLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        Libro l = catalogoPorIsbn.get(isbn);
        if (u == null || l == null) {
            System.out.println("Usuario o libro no encontrado.");
            return;
        }
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("El libro ya está prestado.");
            return;
        }
        u.prestarLibro(isbn);
        isbnsPrestados.add(isbn);
        System.out.println("Libro '" + l.getTitulo() + "' prestado a " + u.getNombre() + ".");
    }

    public void devolverLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        if (u == null) {
            System.out.println("Usuario no encontrado.");
            return;
        }
        if (!u.getIsbnsPrestados().contains(isbn)) {
            System.out.println("El usuario no tenía prestado este libro.");
            return;
        }
        u.devolverLibro(isbn);
        isbnsPrestados.remove(isbn);
        System.out.println("Libro devuelto correctamente por " + u.getNombre() + ".");
    }

    // Búsquedas
    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getTitulo().toLowerCase().contains(texto.toLowerCase())) res.add(l);
        }
        return res;
    }

    public List<Libro> buscarPorAutor(String texto) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getAutor().toLowerCase().contains(texto.toLowerCase())) res.add(l);
        }
        return res;
    }

    public List<Libro> buscarPorCategoria(String texto) {
        List<Libro> res = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getCategoria().toLowerCase().contains(texto.toLowerCase())) res.add(l);
        }
        return res;
    }

    public List<Libro> listarPrestados(String idUsuario) {
        List<Libro> res = new ArrayList<>();
        Usuario u = usuariosPorId.get(idUsuario);
        if (u == null) return res;
        for (String isbn : u.getIsbnsPrestados()) {
            Libro l = catalogoPorIsbn.get(isbn);
            if (l != null) res.add(l);
        }
        return res;
    }
}
