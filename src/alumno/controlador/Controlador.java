/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.controlador;

import alumno.vista.Vista;
import alumno.modelo.Modelo;
import alumno.modelo.Alumno;
import alumno.modelo.IDAO;
import alumno.vista.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class Controlador implements ActionListener {

    private IDAO<Alumno> modelo;
    private IVista<Alumno> vista;

    public Controlador(IVista<Alumno> vista, IDAO<Alumno> modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Alumno aux, aux2;
        boolean flag;
        if (e.getActionCommand().equals("Siguiente")) {
            aux = vista.getObjeto();
            aux2 = modelo.siguiente(aux);
            vista.setObjeto(aux2);
        } else if (e.getActionCommand().equals("Primero")) {
            aux2 = modelo.primero();
            vista.setObjeto(aux2);
        } else if (e.getActionCommand().equals("Anterior")) {
            aux2 = vista.getObjeto();
            aux = modelo.anterior(aux2);
            vista.setObjeto(aux);
        } else if (e.getActionCommand().equals("Ultimo")) {
            aux = modelo.ultimo();
            vista.setObjeto(aux);
        } else if (e.getActionCommand().equals("Alta")) {
            try {
                aux = vista.getObjeto();
                if (!modelo.alta(aux)) {
                    vista.muestraMensaje("No es posible realizar la operación");
                }
            } catch (Exception ex) {
                vista.muestraMensaje(ex.getMessage());
            }

        } else if (e.getActionCommand().equals("Baja")) {
            aux = vista.getObjeto();
            flag = modelo.baja(aux);
            if (flag) {
                vista.muestraMensaje("Baja realizada");
            } else {
                vista.muestraMensaje("No se ha podido borrar");
            }
        } else if (e.getActionCommand().equals("Modificar")) {

        } else if (e.getActionCommand().equals("Consulta")) {
            aux = vista.getObjeto();
            aux = modelo.consulta(aux.getId());
            if (aux == null) {
                vista.muestraMensaje("No existe el alumno");
            } else {
                vista.setObjeto(aux);
            }
        } else if (e.getActionCommand().equals("CNombre")) {

        }
    }

}
