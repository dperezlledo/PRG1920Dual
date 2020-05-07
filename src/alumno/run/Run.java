/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.run;

import alumno.controlador.Controlador;
import alumno.modelo.Modelo;
import alumno.vista.Vista;

/**
 *
 * @author David
 */
public class Run {

     public static void main(String[] args) {
        Vista v = new Vista();
        Modelo m = new Modelo();
        Controlador c = new Controlador(v, m);

        v.setControlador(c);
        v.mostrar();
    }
}
