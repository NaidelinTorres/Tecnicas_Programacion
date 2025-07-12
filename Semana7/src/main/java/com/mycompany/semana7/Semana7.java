/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana7;

/**
 *
 * @author USER
 */
public class Semana7 {

    public static void main(String[] args) {
        // Canciones con diferentes constructores
        Cancion c1 = new Cancion ();
        Cancion c2 = new Cancion ("Rolling in the Deep","Adele",233);
        Cancion c3 = new Cancion ("Perfect","Ed Sheeran");
        // Mostrar informacion 
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
    }
}
