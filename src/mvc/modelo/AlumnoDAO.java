/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.modelo;

/**
 *
 * @author David
 */
public class AlumnoDAO implements IDAO{
    private Alumno[] lista;
    
    public AlumnoDAO() {        
        lista = new Alumno[12];
        // Llenar el array con 12 alumnos de DUAL
        fdskljdslkf
    }
    
    @Override
    public Alumno primero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno ultimo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno siguiente(Alumno old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno anterior(Alumno old) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
