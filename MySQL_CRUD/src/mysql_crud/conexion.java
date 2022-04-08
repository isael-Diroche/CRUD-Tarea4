
package mysql_crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*import java.sql.Statement;
import java.sql.ResultSet;*/

public class conexion {
    Connection con;

    public Connection conexion() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tarea4","root","ID_mysql_00");
        } catch (ClassNotFoundException e){
            System.out.println("Error de conexion: "+e);
        }
        return con;
    }
    
    public Connection getConnection(){
        return con;
    }
    
    /*public static void main(String[] args) throws SQLException {
        Conexion cn = new Conexion(); 

        try {
            Statement st = (Statement) cn.con.createStatement();
            ResultSet rs = (ResultSet) st.executeQuery("Select * from cliente");
            while(rs.next()){
                System.out.println(rs.getInt("idCliente")+ " " + rs.getString("nombre")+ " " + rs.getInt("direccion"));
            }
            cn.con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }*/
}
