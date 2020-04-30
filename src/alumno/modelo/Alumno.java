/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.modelo;

/**
 *
 * @author javie
 */
public class Alumno implements Comparable<Alumno>{
    private int id,edad;
    private String nombre,apellido;
    
    public Alumno(int id, int edad, String nombre, String apellido){
        this.id= id;
        this.edad= edad;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    
    public Alumno (){
        
    }
    
    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int compareTo(Alumno o) {
        if(this.id==o.getId()){
            return 1;
        }else{
            return 0;
        }
    }
    
    
    
    
}
