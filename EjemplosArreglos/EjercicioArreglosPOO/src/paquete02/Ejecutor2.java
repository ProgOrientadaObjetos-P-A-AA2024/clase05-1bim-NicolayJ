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
        
        
        
        LibretaCalificacion libreta2 = new LibretaCalificacion(nombreEstudiante,
                notas);
        
        libreta2.establecerPromedio();
        libreta2.establecerPromedioCualitativo();
        
        System.out.printf("%s",libreta2);
    }
}
