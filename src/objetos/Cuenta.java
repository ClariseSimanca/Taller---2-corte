package objetos;
public class Cuenta {

protected Double saldo = 0.0;
protected Integer numeroConsignaciones = 0;
protected Integer numeroRetiros = 0;
protected Double tasaAnual;
protected Double comisionMensual = 0.0;

    public Cuenta() {
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(Double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public Double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(Double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }


    public void consignar(double cantidad){
    saldo = cantidad + saldo;
    System.out.println("El saldo actual es: $" + saldo);
    numeroConsignaciones = numeroConsignaciones + 1;
    
    }
    public void retirar(double retiro){
        if(retiro <= saldo ){
        saldo = saldo - retiro;
            System.out.println("El saldo actual es: $" + saldo);
        numeroRetiros = numeroRetiros + 1;
        }else
            System.out.println("El saldo no es suficiente");
    }
    public void calcularinteres(){
    double tasaMensual;
    double interesMensual;
    tasaMensual = tasaAnual / 12;
    interesMensual = saldo * tasaMensual;
    saldo = saldo * interesMensual;
    System.out.println("El interes del saldo es: $" + saldo);
            
    }
    public void extractomensual(){
        saldo = saldo - comisionMensual;
        calcularinteres();
    }
}
