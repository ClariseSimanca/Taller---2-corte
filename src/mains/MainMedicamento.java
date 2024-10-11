package mains;
import objetos.Medicamento;

public class MainMedicamento {
    public static void main(String[] args) {
       
        Medicamento med_1 = new Medicamento();
        Medicamento.Posologia med_1pos = med_1.new Posologia();
        med_1.setNombreMedicamento("Rivotril");
        med_1.setFabricanteMedicamento("Rache");
        med_1.setViadeAdm("Oral");
        med_1pos.setUsuarios("Adultos y mayores de 16 años");
        med_1pos.setDosis(2);
        med_1pos.setPeriodo(10);
        med_1pos.setRecomendaciones("Consumir bajo supervisión médica");
        med_1.imprimir();
        med_1pos.imprimir();
      
    }
}
