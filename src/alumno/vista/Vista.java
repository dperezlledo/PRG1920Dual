/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.vista;

import alumno.controlador.Controlador;
import alumno.modelo.Alumno;
import alumno.modelo.Modelo;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author javie
 */
public class Vista extends JFrame implements IVista {

    private GridLayout gl, gl1;
    private JButton siguiente, anterior, primero, ultimo;
    private JLabel id, nombre, apellido, edad;
    private JTextField id1, nombre1, apellido1, edad1;
    private BorderLayout bl;
    private JPanel panelCentro, panelNorte;
    private Controlador control;

    public Vista() {

        panelCentro = new JPanel();
        panelNorte = new JPanel();
        bl = new BorderLayout();
        gl = new GridLayout(4, 2);
        gl1 = new GridLayout(1, 4);
        siguiente = new JButton("Siguiente");
        anterior = new JButton("Anterior");
        primero = new JButton("Primero");
        ultimo = new JButton("Ultimo");
        id = new JLabel("Id");
        edad = new JLabel("Edad");
        nombre = new JLabel("Nombre");
        apellido = new JLabel("Apellido");
        id1 = new JLabel();
        edad1 = new JLabel();
        nombre1 = new JLabel();
        apellido1 = new JLabel();

        panelNorte.setLayout(gl1);
        panelCentro.setLayout(gl);
        panelCentro.add(id);
        panelCentro.add(id1);
        panelCentro.add(nombre);
        panelCentro.add(nombre1);
        panelCentro.add(apellido);
        panelCentro.add(apellido1);
        panelCentro.add(edad);
        panelCentro.add(edad1);
        panelNorte.add(primero);
        panelNorte.add(anterior);
        panelNorte.add(siguiente);
        panelNorte.add(ultimo);

        getContentPane().setLayout(bl);
        getContentPane().add(panelNorte, BorderLayout.NORTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);

        siguiente.setActionCommand("siguiente");
        anterior.setActionCommand("anterior");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setControlador(Controlador cc) {
        this.control = cc;
        siguiente.addActionListener(this.control);
        anterior.addActionListener(this.control);
        ultimo.addActionListener(this.control);
        primero.addActionListener(this.control);
    }

    public void setId(int id) {
        id1.setText(id + "");
    }

    public void setEdad(int edad) {
        edad1.setText(edad + "");
    }

    public void setApellido(String ape) {
        apellido1.setText(ape);
    }

    public void setNombre(String nom) {
        id1.setText(nom);
    }

    @Override
    public Alumno getAlumno() {
        Alumno aux = new Alumno();
        aux.setId(jtxtId.getText());
        aux.setNombre(jtxtNombre.getText());
        etc
        .... 
        return aux;

    }

    @Override
    public void setAlumno(Alumno a) {
        jtxtId.setText(a.getId());
        jtxtNombre.setText(a.getNombre());
        etc
    

    ....
    }

    @Override
    public void setControlador(Controlador controlador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
