/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import mvc.controlador.*;
import mvc.modelo.*;
import mvc.vista.*;

/**
 *
 * @author David
 */
public class Run {
    public static void main(String[] args) {
        MCalculadora modelo = new MCalculadora();
        //VS_Calculadora vista = new VS_Calculadora();        
        VC_Calculadora vista = new VC_Calculadora();        
        CCalculadora contrador = new CCalculadora(vista,modelo);        
        
        vista.setControlador(contrador);
        vista.mostrar();
        
    }
}
