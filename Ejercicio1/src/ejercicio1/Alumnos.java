/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Salas
 */
public class Alumnos {

    public String nombre;
    public int cedula;
    public int edad;

    public void ObtenerAlumnos(String nom, int ced, int ed) {
        nombre = nom;
        cedula = ced;
        edad = ed;
    }

    public void datos() {
        System.out.printf("EL nombre es : %s\n La sedula es:%d\n La edad es:%d\n"
                + "", nombre, cedula, edad);
    }

}

