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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author javie
 */
public class Vista extends JFrame implements IVista<Alumno> {

    private GridLayout gl, gl1, gsur;
    private JButton siguiente, anterior, primero, ultimo,alta,limpiar, baja, modificar,consulta;
    private JLabel id, nombre, apellido, edad;
    private JTextField id1, nombre1, apellido1, edad1;
    private BorderLayout bl;
    private JPanel panelCentro, panelNorte, panelSur;
    private Controlador control;

    public Vista() {        
        panelCentro = new JPanel();
        panelNorte = new JPanel();
        panelSur = new JPanel();
        bl = new BorderLayout();
        gl = new GridLayout(4, 2);
        gl1 = new GridLayout(1, 4);
        gsur = new GridLayout(1,5);
        // Instanciamos los botones 
        siguiente = new JButton("Siguiente");
        anterior = new JButton("Anterior");
        primero = new JButton("Primero");
        ultimo = new JButton("Ultimo");
        alta= new JButton("Alta");
        limpiar= new JButton("Limpiar");
        consulta = new JButton("Consulta");
        modificar = new JButton("Modificar");        
        baja = new JButton("Baja");
        // Instanciamos las etiquetas y textFields
        id = new JLabel("Id");
        edad = new JLabel("Edad");
        nombre = new JLabel("Nombre");
        apellido = new JLabel("Apellido");
        id1 = new JTextField();
        edad1 = new JTextField();
        nombre1 = new JTextField();
        apellido1 = new JTextField();

        panelNorte.setLayout(gl1);
        panelCentro.setLayout(gl);
        panelSur.setLayout(gsur);
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
        panelSur.add(limpiar);
        panelSur.add(alta);
        panelSur.add(modificar);
        panelSur.add(baja);
        panelSur.add(consulta);
        
        getContentPane().setLayout(bl);
        getContentPane().add(panelNorte, BorderLayout.NORTH);
        getContentPane().add(panelCentro, BorderLayout.CENTER);
        getContentPane().add(panelSur, BorderLayout.SOUTH);

        siguiente.setActionCommand("Siguiente");
        anterior.setActionCommand("Anterior");
        primero.setActionCommand("Primero");
        ultimo.setActionCommand("Ultimo");
        alta.setActionCommand("Alta");        
        baja.setActionCommand("Baja");      
        
        
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id1.setText("");
                apellido1.setText("");
                nombre1.setText("");
                edad1.setText("");
            }
        });
        pack();
        setTitle("Mantenimiento de Alumnos");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public Alumno getObjeto() {
        Alumno aux = new Alumno();
        aux.setId(Integer.parseInt(id1.getText()));
        aux.setNombre(nombre1.getText());
        aux.setApellido(apellido1.getText());
        aux.setEdad(Integer.parseInt(edad1.getText()));
         
        return aux;

    }

    @Override
    public void setObjeto(Alumno a) {
        id1.setText(a.getId()+"");
        nombre1.setText(a.getNombre());
        apellido1.setText(a.getApellido());
        edad1.setText(a.getEdad()+"");
    }

    @Override
    public void setControlador(Controlador controlador) {
        this.control= controlador;
        siguiente.addActionListener(this.control);
        anterior.addActionListener(this.control);
        ultimo.addActionListener(this.control);
        primero.addActionListener(this.control);
        alta.addActionListener(this.control);
    }

    @Override
    public void mostrar() {
        setVisible(true);
        ActionEvent ae = new ActionEvent(this, 1, "Primero");
        this.control.actionPerformed(ae);
    }

    @Override
    public void muestraMensaje(String s) {
        JOptionPane.showMessageDialog(this, s, "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
}
