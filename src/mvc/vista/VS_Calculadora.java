/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import mvc.controlador.CCalculadora;


/**
 *
 * @author David
 */
public class VS_Calculadora extends JFrame implements ICalculadora{
    private JTextField jtxtDato1, jtxtDato2;
    private JComboBox jcboOperacion;
    private JLabel jlbResultado, jlbtxt1, jlbtxt2, jlbOperacion, jlbResul;
    private JButton jbtnCalcular, jbtnLimpiar;
    
    private CCalculadora controlador;
    
    public VS_Calculadora() {     
        jlbtxt1 = new JLabel("Dato 1");
        jtxtDato1 = new JTextField();
        jlbtxt2 = new JLabel ("Dato 2");
        jtxtDato2 = new JTextField();
        jlbOperacion = new JLabel ("Operacion");
        String [] op = {"+", "-", "*", "/"};
        jcboOperacion = new JComboBox(op);
        jbtnCalcular = new JButton("Calcular");
        jbtnCalcular.setActionCommand("calcular");
        jbtnLimpiar = new JButton("Limpiar");
        jlbResul = new JLabel("Resultado");
        jlbResultado = new JLabel("0");
        getContentPane().setLayout(new GridLayout(5,2));
        getContentPane().add(jlbtxt1);
        getContentPane().add(jtxtDato1);
        getContentPane().add(jlbOperacion);
        getContentPane().add(jcboOperacion);
        getContentPane().add(jlbtxt2);
        getContentPane().add(jtxtDato2);
        getContentPane().add(jlbResul);
        getContentPane().add(jlbResultado);
        getContentPane().add(jbtnCalcular);  
        getContentPane().add(jbtnLimpiar);  
        
        jbtnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtxtDato1.setText("");
                jtxtDato2.setText("");
            }
        });
        pack();               
    }   
   

    @Override
    public float getDato1() {
        return Float.parseFloat(jtxtDato1.getText());
    }

    @Override
    public float getDato2() {
        return Float.parseFloat(jtxtDato2.getText());
    }

    @Override
    public String getOperacion() {
        return jcboOperacion.getSelectedItem().toString();
    }

    @Override
    public void setResultado(float resultado) {
        jlbResultado.setText(resultado+"");
    }

    @Override
    public void setControlador(CCalculadora cc) {
        this.controlador = cc;
        jbtnCalcular.addActionListener(this.controlador);
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }
    
}
