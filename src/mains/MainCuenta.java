package mains;
import objetos.CuentaAhorros;

public class MainCuenta {
    public static void main(String[] args) {
        
        CuentaAhorros cuenta_1 = new CuentaAhorros();
        cuenta_1.setSaldo(10000.0);
        cuenta_1.setActiva(true);
        cuenta_1.setTasaAnual(0.15);
        cuenta_1.setComisionMensual(0.0);
        cuenta_1.imprimir();
        cuenta_1.consignar(2000.0);
        cuenta_1.retirar(1500.0);
        cuenta_1.retirar(1000);
        cuenta_1.calcularinteres();
       
       
       
    }

}
