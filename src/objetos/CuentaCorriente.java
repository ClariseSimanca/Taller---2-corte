package objetos;

public class CuentaCorriente extends Cuenta {
    protected Integer sobregiro = 0;

    public CuentaCorriente() {
    }
    
     public void imprimir(){
        System.out.println("Saldo: $" + saldo);
         System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Cantidad de consignaciones: " 
                + numeroConsignaciones);
        System.out.println("Cantidad de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual);
        System.out.println("Comision mensual: " + comisionMensual);
    
     }
     
    @Override
     public void retirar(double retiro){
        if(retiro <= saldo ){
        saldo = saldo - retiro;
        numeroRetiros = numeroRetiros + 1;
        }else
            System.out.println("El saldo no es suficiente");
        sobregiro = sobregiro + 1;
    }

      }