
package objetos;


public abstract class Animal {
    protected String sonido;
    protected String alimento;
    protected String habitat;
    protected String nombreCientifico;

    public Animal() {
    }
    
    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getHabitat();
    public abstract String getAlimento();
  
    }         
    
