/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.vista;
import alumno.controlador.Controlador;
import alumno.modelo.Alumno;


/**
 *
 * @author David
 */
public interface IVista<T> {
    public abstract T getObjeto();
    public abstract void setObjeto(T a);
    public void muestraMensaje(String s);
    
    public abstract void setControlador(Controlador controlador);
    public abstract void mostrar();
}
