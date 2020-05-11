/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposgenericos;

import alumno.modelo.Alumno;
import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author David
 */
public class Prueba2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(new Integer(1234), "Este es el valor");
        
        String s = hm.get(1234);     
        
    }
}
