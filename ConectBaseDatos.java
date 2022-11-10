package control;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConectBaseDatos {
    
    
    Connection cone;
    String driver="com.mysql.cj.jdbc.Driver";
    String NombDB="produc";
    String url= "jdbc:mysql://localhost:3306/"+NombDB+"?useSSL=false&serverTimezone=UTC";
    String user="root";
    String password="";
    
    
     public Connection ConectarBaseDatos() {
       try{
           Class.forName(driver);
           cone = (Connection) DriverManager.getConnection(url,user, password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("|Error en la conexion:" + e+"|");
        }
        return cone;
    }
}

