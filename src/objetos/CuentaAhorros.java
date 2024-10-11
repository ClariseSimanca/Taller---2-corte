package objetos;

public class CuentaAhorros extends Cuenta{
    protected Boolean activa;
    public Boolean getActiva() {
        return activa;
    }
    public void setActiva(Boolean activa) {
        this.activa = activa;
    } 
    public void imprimir(){
        System.out.println("Cuenta Ahorros");
        System.out.println("Saldo inicial: $" + saldo);
        System.out.println("La cuenta esta activa: " + activa);
        System.out.println("Cantidad de consignaciones: " 
                + numeroConsignaciones);
        System.out.println("Cantidad de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comision mensual: " + comisionMensual);
    }
    
    
}
