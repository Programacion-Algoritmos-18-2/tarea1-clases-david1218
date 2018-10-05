/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner imprimir = new Scanner(System.in);
        Alumnos obj1 = new Alumnos();
        String nom;
        int ced;
        int ed;
        System.out.println("Ingrese el nombre:\n");
        nom = imprimir.nextLine();
        System.out.println("Ingrese el cedula:\n");
        ced = imprimir.nextInt();
        System.out.println("Ingrese el edad:\n");
        ed = imprimir.nextInt();

        obj1.ObtenerAlumnos(nom, ced, ed);
        obj1.datos();
        imprimir.nextLine();
        Alumnos obj2 = new Alumnos();
        System.out.println("Ingrese el nombre:\n");
        nom = imprimir.nextLine();
        System.out.println("Ingrese el cedula:\n");
        ced = imprimir.nextInt();
        System.out.println("Ingrese el edad:\n");
        ed = imprimir.nextInt();
        obj2.ObtenerAlumnos(nom, ced, ed);
        obj2.datos();
    }
}
