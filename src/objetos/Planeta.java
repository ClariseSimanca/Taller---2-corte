package objetos;

import java.awt.BorderLayout;


public class Planeta {
    //atributos
    private String nombre = null;
    private Integer satelites= 0;
    private Double masa= 0.0;
    private Double volumen = 0.0;
    private Integer diametro = 0;
    private Integer distanciaSol = 0;
    private String tipoPlaneta = null; 
    private Boolean observable = false ;
    // constructor
    public Planeta() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSatelites() {
        return satelites;
    }

    public void setSatelites(Integer satelites) {
        this.satelites = satelites;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Integer getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(Integer distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public String getTipoPlaneta() {
        return tipoPlaneta;
    }

    public void setTipoPlaneta() {
        String tipo;
        int circunferencia;
        circunferencia = (int) (this.getDiametro()*Math.PI);
        if (circunferencia <= 8000) {
            tipo= "Enano";
            tipoPlaneta = tipo;
        }else {
            if (circunferencia > 41000) {
                tipo = "Gaseoso";
                tipoPlaneta = tipo;  
            }else  
                tipo = "Terrestre";
               tipoPlaneta = tipo;     
        }
        
    }

    public Boolean getObservable() {
        return observable;
    }

    public void setObservable(Boolean observable) {
        this.observable = observable;
    }
    
    //metodos
    
    public void imprimir(){
        
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de satelites: " + satelites);
        System.out.println("Masa del planeta: " + masa + " kg");
        System.out.println("Volumen del planeta: " + volumen + " km cúbicos");
        System.out.println("Diametro del planeta: " + diametro + " km");
        System.out.println("Distancia al sol: " + distanciaSol + " km");
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Es observable: " + observable);
        
    }
  
    public void densidad(){
        double densidad;
        densidad = this.getMasa()/this.getVolumen();
        System.out.println("La densidad es: " + densidad + " g/cm cúbicos") ;
    }
    
    public void exteriorono(){
       int ua = 508632758;
        if (ua >= this.getDistanciaSol()) {    
            System.out.println("Es un planeta interior");
        }else System.out.println("Es un planeta exterior");     
    } 
}
