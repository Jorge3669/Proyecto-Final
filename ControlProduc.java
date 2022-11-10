
package control;

import java.awt.event.ActionEvent;
import model.Produc;
import model.ProducDAO;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vist.Interf;

public class ControlProduc implements ActionListener {
    ProducDAO producdao= new ProducDAO();
    Interf vist =new Interf();
    
    private int cod;
    private String nombProd;
    private int stockInic;
    private int Compras;
    private int Ventas;
    private int total=Compras-Ventas;
    
    public ControlProduc(Interf vist){
    this.vist=vist;
    vist.setVisible(true);
    agregarEventos();
    }
    
    private void agregarEventos(){
        vist.getBtnAgregar().addActionListener(this);
    }
    
    private boolean ValidarDatos(){
        if ("".equals(vist.getTxtNomProd().getText())) {
            JOptionPane.showMessageDialog(null, "Se deben de llenar los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
}
    
    
    private boolean cargarDatos(){
        try {
            nombProd = vist.getTxtNomProd().getText();
            cod = Integer.parseInt(vist.getTxtCod().getText());
            stockInic = Integer.parseInt(vist.getTxtStockInic().getText());
            Compras = Integer.parseInt(vist.getTxtCompras().getText());
            Ventas = Integer.parseInt(vist.getTxtVentas().getText());
            return true;
        } catch (Exception e) {
            System.out.println("Error subir data: "+e);
            return false;
        }
    }
    
    
    public void limpiar(){
        vist.getTxtCod().setText("");
        vist.getTxtNomProd().setText("");
        vist.getTxtCompras().setText("");
        vist.getTxtVentas().setText("");
        vist.getTxtStockInic().setText("");
        cod=0;
        nombProd="";
        stockInic=0;
        Compras=0;
        Ventas=0;
    }
    
    
    private void agregarProductos(){
        try {
            if (ValidarDatos()) {
                if(cargarDatos()){
                   Produc produc = new Produc(nombProd, stockInic, Compras, Ventas);
                   producdao.agregar(produc);
                   JOptionPane.showMessageDialog(null, "Se ha subido el registro exitosamente");
                   limpiar();
                }
            }
        } catch (Exception e) {
            System.out.println("Error al agregar: "+e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==vist.getBtnAgregar()) {
            agregarProductos();
        }
    }
}    
