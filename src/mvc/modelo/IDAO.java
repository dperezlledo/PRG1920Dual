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
public interface IDAO {
    public Alumno primero();
    public Alumno ultimo();
    public Alumno siguiente(Alumno old);
    public Alumno anterior(Alumno old);
}
