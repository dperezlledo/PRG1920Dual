/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.modelo;

import alumno.modelo.Alumno;

/**
 *
 * @author David
 */
public interface IDAO {
    // botones de navegacion
    public Alumno primero();
    public Alumno ultimo();
    public Alumno siguiente(Alumno old);
    public Alumno anterior(Alumno old);
    // Operaciones CRUD
    public boolean alta (Alumno a);
    public boolean baja (Alumno a);
    public boolean modificar (Alumno viejo, Alumno nuevo);
    public Alumno consulta(int id);
    
    // Otros
    public Alumno consultaPorNombre(String nombre);
    
}
