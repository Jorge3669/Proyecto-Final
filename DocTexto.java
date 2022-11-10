package control;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Invent;
import model.Produc;

public class DocTexto {
    Produc producto = new Produc();
    public File Doc;
    public String Nombre_fichero, sino;
    public void GuardarDatos() {
        FileWriter Escribir;
        PrintWriter Mostrar = null;
        try {
            String Doc = null;
            Produc prod = new Produc();
            Invent inventario = new Invent();
            Escribir = new FileWriter(Doc, true);
            Mostrar = new PrintWriter(Escribir);       
            Mostrar.println(inventario.getFechaFinal()+"|"+prod.getCod()+"|"+producto.getNombProd()+"|"+producto.getCompras()+"|"+producto.getVentas()+"|"+producto.getTotal()+"|"+inventario.getFechaInic());       
        } catch (IOException ex) {
            Logger.getLogger(Produc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CrearFichero() {
        sino = JOptionPane.showInputDialog("¿Quiere guardar los datos en un documento de texto?");
        if(!"si".equals(sino)){
            JOptionPane.showMessageDialog(null, "No se guardarán los datos");  
        }
        else
        {
            Nombre_fichero = JOptionPane.showInputDialog("Ingrese el nombre del documento");   
            Doc = new File("D:\\Documentos\\U\\4to Semestre\\Programación II\\Proyecto Final\\"+Nombre_fichero+".txt");
            if (!Doc.exists()) {
                try {
                    Doc.createNewFile();
                } catch (IOException e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe el documento de texto\n Se guardará en dicho documento");
                System.out.println("Hay un documento existente");
            }
        }
    }
}
    
