/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.controlador;

import alumno.vista.Vista;
import alumno.modelo.Modelo;
import alumno.modelo.Alumno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author javie
 */
public class Controlador implements ActionListener {

    private Modelo modelo;
    private Vista vista;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Alumno aux, aux2;
        if (e.getActionCommand().equals("Siguiente")) {
            aux = vista.getAlumno();
            aux2 = modelo.siguiente(aux);
            vista.setAlumno(aux2);
        } else if (e.getActionCommand().equals("Primero")) {
            aux2 = modelo.primero();
            vista.setAlumno(aux2);
        } else if (e.getActionCommand().equals("Primero")) {
            aux = modelo.primero();
            vista.setId(aux.getId());
            vista.setEdad(aux.getEdad());
            vista.setNombre(aux.getNombre());
            vista.setApellido(aux.getApellido());
        } else if (e.getActionCommand().equals("Ultimo")) {
            aux = modelo.ultimo();
            vista.setId(aux.getId());
            vista.setEdad(aux.getEdad());
            vista.setNombre(aux.getNombre());
            vista.setApellido(aux.getApellido());
        }
    }

}
