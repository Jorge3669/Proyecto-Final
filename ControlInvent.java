
package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Invent;
import java.sql.Connection;
import model.Produc;

public class ControlInvent {
   ConectBaseDatos conect = new ConectBaseDatos();
   Connection cone;
   PreparedStatement ps;   
   
    
    public void guardar(Invent inventario){
        
        
        Produc producto = new Produc();
        String sql = "insert into produc (IdPr, fechaInic, Cod, fechaFinal) values(?, ?, ?, ?);";
        try {
            
            cone = conect.ConectarBaseDatos();
            
            ps = cone.prepareStatement(sql);
            ps.setInt(1, inventario.getIdPr());
            ps.setString(2, inventario.getFechaInic());
            ps.setInt(3, producto.getCod());
            ps.setString(4, inventario.getFechaFinal());
            ps.executeUpdate();
                        
        } catch (SQLException e) {
            System.out.println("Error al guardar... "+e);
        }
        
        
    }  
}
