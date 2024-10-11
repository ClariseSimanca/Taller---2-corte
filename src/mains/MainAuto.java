package mains;
import enums.ColorAutomovil;
import enums.TipoAutomovil;
import enums.TipoCombustible;
import objetos.Automovil;

public class MainAuto {
    public static void main(String[] args) {
        Automovil auto_1 = new Automovil();
        
        auto_1.setMarca("Renault");
        auto_1.setModelo(2019);
        auto_1.setMotor(1.728);
        auto_1.setCombustible(TipoCombustible.Diesel);
        auto_1.setTipoAutomovil(TipoAutomovil.Familiar);
        auto_1.setPuertas(4);
        auto_1.setAsientos(5);
        auto_1.setVelocidadMax(200);
        auto_1.setVelocidadAct(100);
        auto_1.setColorAutomovil(ColorAutomovil.Rojo);
        auto_1.imprimir();
        auto_1.velocidadAcelerar(20);
        auto_1.velocidadDesacelerar(50);
        auto_1.Frenar();
        
    }
}
