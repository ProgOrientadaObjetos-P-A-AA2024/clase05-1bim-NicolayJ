/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {
            new Calificacion(10, "Computación"), 
            new Calificacion(9, "Electrónica")
                /*
                Se crea un arreglo llamado calificaciones de tipo Calificacion
                en donde se envia los parametros o valores en el arreglo pero en 
                este caso se denomina objeto anonimo ya que no se le da un nombre
                al objeto en si, sino que esta inicializando los valores en los 
                parametros
                */
        };
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
