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
public interface IDAO<T> {
    // botones de navegacion
    public T primero();
    public T ultimo();
    public T siguiente(T old);
    public T anterior(T old);
    // Operaciones CRUD
    public boolean alta (T a) throws Exception;
    public boolean baja (T a);
    public boolean modificar (T viejo, T nuevo);
    public T consulta(int id);
    
    // Otros
    public T consultaPorNombre(String nombre);
    
}
