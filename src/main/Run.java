/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import mvc.controlador.CCalculadora;
import mvc.modelo.MCalculadora;
import mvc.vista.VCalculadora;

/**
 *
 * @author David
 */
public class Run {
    public static void main(String[] args) {
        MCalculadora modelo = new MCalculadora();
        VCalculadora vista = new VCalculadora();        
        CCalculadora contrador = new CCalculadora(vista,modelo);        
        
        vista.setControlador(contrador);
        vista.mostrar();
        
    }
}
