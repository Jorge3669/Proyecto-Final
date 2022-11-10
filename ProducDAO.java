package model;

import control.ConectBaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProducDAO {
    ConectBaseDatos conect= new ConectBaseDatos();
    Connection cone;
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
        String sql ="select * from productos";
        List<Produc> lista=new ArrayList<>();
        try{
            cone = conect.ConectarBaseDatos();
            ps = cone.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Produc producto= new Produc();
                producto.setCod(rs.getInt(1));
                producto.setNombProd(rs.getString(2));
                producto.setStockInc(rs.getInt(3));
                producto.setCompras(rs.getInt(4));
                producto.setVentas(rs.getInt(5));
                producto.setTotal(rs.getInt(6));
                lista.add(producto);
            }  
        }catch (Exception e){
        System.out.println("");
        }
        return lista;
    }
    public void agregar(Produc produc){
        String sql = "insert into productos(nombProd, stockInc, Compras, Ventas, total) values(?, ?, ?, ?, ?)";
        try {
            cone=conect.ConectarBaseDatos();
            ps = cone.prepareCall(sql);
            
            ps.setString(1, produc.getNombProd());
            ps.setInt(2, produc.getStockInc());
            ps.setInt(3, produc.getCompras());
            ps.setInt(4, produc.getVentas());
            ps.setInt(5, produc.getTotal());
            ps.executeQuery();
        } catch (SQLException e) {
            
            System.out.println("|Error al agregar: "+e+"|");
        }
    }
}