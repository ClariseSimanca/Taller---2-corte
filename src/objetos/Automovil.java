package objetos;
import enums.ColorAutomovil;
import enums.TipoAutomovil;
import enums.TipoCombustible;

public class Automovil {
    //atributos
    private String marca;
    private Integer modelo;
    private Double motor;
    private Integer puertas;
    private Integer asientos;
    private Integer velocidadMax;
    private Integer velocidadAct = 0;
    private TipoCombustible combustible;
    private TipoAutomovil tipoAutomovil;
    private ColorAutomovil colorAutomovil;
    
    //constructores (uno vacio y otro con parametros :b)

    public Automovil() {
    }
    public Automovil(String marca, Integer modelo, Double motor,
            Integer puertas, Integer asientos, Integer velocidadMax,
            TipoCombustible combustible, TipoAutomovil tipoAutomovil,
            ColorAutomovil colorAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMax = velocidadMax;
        this.combustible = combustible;
        this.tipoAutomovil = tipoAutomovil;
        this.colorAutomovil = colorAutomovil;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Double getMotor() {
        return motor;
    }

    public void setMotor(Double motor) {
        this.motor = motor;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Integer getAsientos() {
        return asientos;
    }

    public void setAsientos(Integer asientos) {
        this.asientos = asientos;
    }

    public Integer getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(Integer velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public Integer getVelocidadAct() {
        return velocidadAct;
    }

    public void setVelocidadAct(Integer velocidad) {
        if (velocidad <= velocidadMax) {
           velocidadAct = velocidad;
        }else
    System.out.println("No es posible la velocidad propuesta"
                    + " ya que supera el maximo");
          
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public ColorAutomovil getColorAutomovil() {
        return colorAutomovil;
    }

    public void setColorAutomovil(ColorAutomovil colorAutomovil) {
        this.colorAutomovil = colorAutomovil;
    }
    //metodos      
    public void velocidadAcelerar(Integer nuevaVel){ 
        if (nuevaVel <= this.getVelocidadMax()) { 
            velocidadAct = this.velocidadAct + nuevaVel;
            System.out.println("La velocidad actual es: " + velocidadAct 
                    + " m/s");         
        }else    
            System.out.println("La velocidad propuesta supera el maximo");                   
    }
       public void velocidadDesacelerar(Integer restaVel){ 
        if (restaVel <= this.velocidadAct) { 
            velocidadAct = this.velocidadAct - restaVel;
            System.out.println("La velocidad actual es: " + velocidadAct 
                    + " m/s");         
        }else    
            System.out.println("No puede desacelerar con una"
                    + " velocidad negativa ");                   
    }
        public void Frenar(){ 
        int frenar; 
        frenar = velocidadAct - velocidadAct;
        velocidadAct = frenar;
            System.out.println("La velocidad actual es: " + frenar + " m/s");
            System.out.println("El vehiculo ha frenado");
    }
      public double tiempoLlegada(int distancia){
    double tiempo;
    tiempo = (distancia/this.getVelocidadAct());
    return tiempo;
    }
      
      public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " l");
        System.out.println("Tipo de combustible: " + combustible);
        System.out.println("Tipo de automovil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + puertas);
        System.out.println("Cantidad de asientos: " + asientos);
        System.out.println("Velocidad máxima: " + velocidadMax + " m/s");
        System.out.println("Color: " + colorAutomovil);
        System.out.println("Velocidad actual: " + velocidadAct + " m/s");
    }
    
}
