
package model;



public class Invent {
    private int idPr;
    private String fechaInic;
    private String fechaFinal;
    public Invent(){
        
    }

    public Invent(int idPr, String fechaInic, String fechaFinal) {
        this.idPr = idPr;
        this.fechaInic = fechaInic;
        this.fechaFinal = fechaFinal;
    }

    
    public int getIdPr() {
        return idPr;
    }
    public void setIdPr(int idPr) {
        this.idPr = idPr;
    }
    public String getFechaInic() {
        return fechaInic;
    }
    public void setFecha_in(String fechaInic) {
        this.fechaInic = fechaInic;
    }
    public String getFechaFinal() {
        return fechaFinal;
    }
    public void setFecha_fin(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
}
