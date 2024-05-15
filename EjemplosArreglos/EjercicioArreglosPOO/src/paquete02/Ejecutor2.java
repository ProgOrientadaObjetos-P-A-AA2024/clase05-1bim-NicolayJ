/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author dj931
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        double [] notas = {10,9,8,10};
        String nombreEstudiante = "Diego Jimenez";
        
        
        
        LibretaCalificacion libreta2 = new LibretaCalificacion(
                nombreEstudiante,
                notas);
        
        libreta2.establecerPromedio();
        // Si comento la linea 24 lo que pasaria es que no se llamaria al metodo 
        // establecerPromedio y por ende tomaria el valor por defecto al imprimirlo
        // (0,00 porque es el valor por defecto de una variable de tipo double)
        libreta2.establecerPromedioCualitativo();
        // Si comento la linea 28 lo que pasaria es que no se llamaria al metodo 
        // establecerPromedioCualitativo y por ende tomaria el valor por defecto 
        //al imprimirlo (null porque es el valor por defecto de una cadena vacia)
        System.out.printf("%s",libreta2);
    }
}
