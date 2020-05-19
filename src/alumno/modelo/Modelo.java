/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author javie
 */
public class Modelo implements IDAO<Alumno> {

    private Alumno clase[];

    public Modelo() {
        clase = new Alumno[13];
        Alumno aitor = new Alumno(1, 19, "Aitor", "Leria");
        Alumno alvaro = null;
        //new Alumno(2, 19, "Alvaro", "Carbajo");
        Alumno fran = new Alumno(3, 20, "Fran", "Hacha");
        Alumno hugo = new Alumno(4, 18, "Hugo", "Rico");
        Alumno javier = new Alumno(5, 19, "Javier", "Marin");
        Alumno jose = new Alumno(6, 19, "Jose Javier", "Machin");
        Alumno sergioB = new Alumno(7, 19, "Sergio", "Barrio");
        Alumno sergioM = new Alumno(8, 19, "Sergio", "Malagon");
        Alumno unai = new Alumno(9, 19, "Unai", "Iraragorri");
        Alumno valentin = new Alumno(10, 19, "Valentin", "Castravete");
        Alumno aaron = new Alumno(11, 19, "Aaron", "Alvarez");
        Alumno iker = new Alumno(12, 19, "Iker", "Abadia");
        Alumno ruben = new Alumno(13, 19, "Ruben", "Martinez");
        clase[0] = aitor;
        clase[1] = alvaro;
        clase[2] = fran;
        clase[3] = hugo;
        clase[4] = javier;
        clase[5] = jose;
        clase[6] = sergioB;
        clase[7] = sergioM;
        clase[8] = unai;
        clase[9] = valentin;
        clase[10] = aaron;
        clase[11] = iker;
        clase[12] = ruben;
    }

    @Override
    public Alumno primero() {
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] != null) {
                return clase[i];
            }
        }
        System.out.println("No existe ningún alumno");
        return null;
    }

    @Override
    public Alumno ultimo() {
        for (int i = clase.length - 1; i >= 0; i--) {
            if (clase[i] != null) {
                return clase[i];
            }
        }
        System.out.println("No existe ningún alumno");
        return null;
    }

    @Override
    public Alumno siguiente(Alumno old) {
        int i;
        // Primero lo buscamos y si está en la ultima posicion le devolvemos el mismo
        // Si no buscamos hasta el final el siguiente != null
        // Si no hubiera ningún siguiente le damos el mismo
        for (i = 0; i < clase.length; i++) {
            if (clase[i] != null && clase[i].equals(old)) {
                break;
            }
        }
        if (i == clase.length - 1) // Esta en la última posicion
        {
            return clase[i]; // devolvemos el mismo
        } else {
            for (int j = i + 1; j < clase.length; j++) {
                if (clase[j] != null) {
                    return clase[j];
                }
            }
            return clase[i];
        }
    }

    @Override
    public Alumno anterior(Alumno old) {
        // EL ALUMNO DEBE DEPURAR EL BOTON SIGUIENTE RECIEN CREADO COMPROBAR SU FUNCIONAMIENTO
        // Y PROGRAMAR EL BOTON ANTERIOR
        return null;
    }

    @Override
    public boolean alta(Alumno a) throws Exception  {
        Alumno aux;
       
        aux = consulta(a.getId());
        if (aux == null) {
            for (int i = 0; i < clase.length; i++) {
                if (clase[i] == null) {
                    clase[i] = a;
                    return true;
                }
            }
        } else {
            throw new Exception("El Alumno con código " + a.getId() + " ya existe en la BD");
        }
        
            
        return false;
    }

    @Override
    public boolean baja(Alumno a) {
        // Buscar el alumno a borrar
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] != null && clase[i].equals(a)) {
                clase[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean modificar(Alumno viejo, Alumno nuevo) {
        // Buscar el alumno a borrar
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] != null && clase[i].equals(viejo)) {
                clase[i].setNombre(nuevo.getNombre());
                clase[i].setApellido(nuevo.getApellido());
                clase[i].setEdad(nuevo.getEdad());
                return true;
            }
        }
        return false;
    }

    @Override
    public Alumno consulta(int id) {
        for (int i = 0; i < clase.length; i++) {
            if (clase[i].getId() == id) {
                return clase[i];
            }
        }
        return null;
    }

    @Override
    public Alumno consultaPorNombre(String nombre) {
        for (int i = 0; i < clase.length; i++) {
            if (clase[i].getNombre().equals(nombre)) {
                return clase[i];
            }
        }
        return null;
    }

}
