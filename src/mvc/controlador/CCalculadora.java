/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.modelo.MCalculadora;
import mvc.vista.ICalculadora;
import mvc.vista.VS_Calculadora;

/**
 *
 * @author David
 */
public class CCalculadora implements ActionListener {

    private ICalculadora vista;
    private MCalculadora modelo;

    public CCalculadora(ICalculadora vista, MCalculadora modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float a, b, result = 0;

        if (e.getActionCommand().equals("calcular")) {
            a = vista.getDato1();
            b = vista.getDato2();
            modelo.setD1(a);
            modelo.setD2(b);
            if (vista.getOperacion().equals("+")) {
                result = modelo.suma();
            } else if (vista.getOperacion().equals("-")) {
                result = modelo.resta();
            } else if (vista.getOperacion().equals("-")) {
                result = modelo.multiplicacion();
            } else if (vista.getOperacion().equals("-")) {
                result = modelo.division();
            }
            vista.setResultado(result);
        }
    }

}
