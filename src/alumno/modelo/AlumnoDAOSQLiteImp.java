/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class AlumnoDAOSQLiteImp implements IDAO<Alumno> {

    private Connection conexion;

    public AlumnoDAOSQLiteImp() {

        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:D:/ejemplo.db");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AlumnoDAOSQLiteImp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOSQLiteImp.class.getName()).log(Level.SEVERE, null, ex);
        }

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

    @Override
    public boolean alta(Alumno a) throws Exception {
        String sql = "INSERT INTO Alumno VALUES (" + a.getId() + ", '" + a.getNombre() + "', '" + a.getApellido() + "', " + a.getEdad() + ")";
        System.out.println(sql);

        Statement sentencia = conexion.createStatement();
        
        try {
            int filas = sentencia.executeUpdate(sql);
            System.out.println("Filas afectadas: " + filas);
        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
           return false;
        }

        sentencia.close(); // Cerrar Statement
        conexion.close();
        return true;
    }

    @Override
    public boolean baja(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Alumno viejo, Alumno nuevo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno consulta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno consultaPorNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
