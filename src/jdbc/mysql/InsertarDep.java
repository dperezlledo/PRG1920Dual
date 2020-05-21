package jdbc.mysql;
import java.sql.*;

public class InsertarDep {

    public static void main(String[] args) {
        int filas;
        String dep="50", dnombre="PUBLICIDAD", loc="LOGROÑO";
        try {
            // EJEMPLO CONEXION A MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "ejemplo", "ejemplo");
            // EJEMPLO CONEXION A ORACLE
            /* Class.forName("oracle.jdbc.driver.OracleDriver");
	       Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",	"ejemplo", "ejemplo");
             */

            //construir orden INSERT	        
            String sql = String.format("INSERT INTO departamentos VALUES (%s, '%s', '%s')", dep, dnombre, loc);
            System.out.println(sql);

            Statement sentencia = conexion.createStatement();
            filas = 0;
            try {
                filas = sentencia.executeUpdate(sql.toString());
                System.out.println("Filas afectadas: " + filas);
            } catch (SQLException e) {
                //e.printStackTrace();
                System.out.printf("HA OCURRIDO UNA EXCEPCI�N:%n");
                System.out.printf("Mensaje   : %s %n", e.getMessage());
                System.out.printf("SQL estado: %s %n", e.getSQLState());
                System.out.printf("C�d error : %s %n", e.getErrorCode());
            }

            sentencia.close(); // Cerrar Statement
            conexion.close(); // Cerrar conexi�n

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }// fin de main
}// fin de la clase
