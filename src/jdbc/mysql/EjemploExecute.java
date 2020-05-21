package jdbc.mysql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploExecute {

    public static void main(String[] args) {
        int f;
        
        try {
            // EJEMPLO CONEXION A MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");
            // EJEMPLO CONEXION A ORACLE
            /* Class.forName("oracle.jdbc.driver.OracleDriver");
	       Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",	"ejemplo", "ejemplo");
             */
            String sql = "SELECT * FROM departamentos";
            Statement sentencia = conexion.createStatement();
            boolean valor = sentencia.execute(sql);

            if (valor) {
                ResultSet rs = sentencia.getResultSet();
                while (rs.next()) {
                    System.out.printf("%d, %s, %s %n", rs.getInt(1), rs.getString(2), rs.getString(3));
                }
                rs.close();
            } else {
                f = sentencia.getUpdateCount();
                System.out.printf("Filas afectadas:%d %n", f);
            }

            sentencia.close();
            conexion.close();
        } //main
        catch (ClassNotFoundException ex) {
            Logger.getLogger(EjemploExecute.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EjemploExecute.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//
