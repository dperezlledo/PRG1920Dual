/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista;

import mvc.controlador.CCalculadora;

/**
 *
 * @author David
 */
public interface ICalculadora {
    public abstract float getDato1();
    public abstract float getDato2();
    public abstract String getOperacion();
    public abstract void setResultado(float resultado);
    
    public abstract void setControlador(CCalculadora controlador);
    public abstract void mostrar();
}
