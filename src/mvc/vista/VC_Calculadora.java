/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import mvc.controlador.CCalculadora;

/**
 *
 * @author David
 */
public class VC_Calculadora implements ICalculadora{
    private CCalculadora controlador;
    private float d1, d2, resultado;
    private String op;
    
    
    @Override
    public float getDato1() {
        return d1;
    }

    @Override
    public float getDato2() {
        return d2;
    }

    @Override
    public String getOperacion() {
        return op;
    }

    @Override
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    @Override
    public void setControlador(CCalculadora controlador) {
        this.controlador = controlador;
    }

    @Override
    public void mostrar() {
        Scanner s = new Scanner (System.in);        
        ActionEvent ae = new ActionEvent(this, 0, "calcular");
        while (true) {
            System.out.print("Dato 1:");
            this.d1 = Float.parseFloat(s.next());
            System.out.print("Operacion (+,-,*,/):");
            this.op = s.next();
            System.out.print("Dato 2:");
            this.d2 = Float.parseFloat(s.next());
            controlador.actionPerformed(ae);
            
            System.out.println("Resultado:" + this.resultado);
            
        }    
        
    }
    
}
