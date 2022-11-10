
package model;


public class Produc {
    private int cod;
    private String nombProd;
    private int stockInc;
    private int Compras;
    private int Ventas;
    private int total=Compras-Ventas;
 
    public Produc(){
        
    }

    public Produc(String nombProd, int stockInc, int Compras, int Ventas) {
        this.nombProd = nombProd;
        this.stockInc = stockInc;
        this.Compras = Compras;
        this.Ventas = Ventas;
        this.total = Compras-Ventas;
    }

    public Produc(int cod, String nombProd, int stockInc, int Compras, int Ventas) {
        this.cod = cod;
        this.nombProd = nombProd;
        this.stockInc = stockInc;
        this.Compras = Compras;
        this.Ventas = Ventas;
        this.total = Compras-Ventas;
    }

    public int getCompras() {
        return Compras;
    }

    public void setCompras(int Compras) {
        this.Compras = Compras;
    }

    public int getVentas() {
        return Ventas;
    }

    public void setVentas(int Ventas) {
        this.Ventas = Ventas;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombProd() {
        return nombProd;
    }

    public void setNombProd(String nombProd) {
        this.nombProd = nombProd;
    }

    public int getStockInc() {
        return stockInc;
    }

    public void setStockInc(int stockInc) {
        this.stockInc = stockInc;
    }
    
}
