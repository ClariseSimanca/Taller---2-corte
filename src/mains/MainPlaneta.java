package mains;
import objetos.Planeta;

public class MainPlaneta {
    public static void main(String[] args) {
        
        Planeta planeta_1 = new Planeta();
        planeta_1.setNombre("Venus");
        planeta_1.setSatelites(0);
        planeta_1.setMasa(4.8690E24);
        planeta_1.setVolumen(928.415345893);
        planeta_1.setDiametro(12104);
        planeta_1.setDistanciaSol(108200000);
        planeta_1.setTipoPlaneta();
        planeta_1.setObservable(true);
        planeta_1.imprimir();
        planeta_1.densidad();
        planeta_1.exteriorono();
        System.out.println("---------------------------------------------");
        Planeta planeta_2 = new Planeta();
        planeta_2.setNombre("Saturno");
        planeta_2.setSatelites(146);
        planeta_2.setMasa(5.6834E26);
        planeta_2.setVolumen(8.2713E14);
        planeta_2.setDiametro(116460);
        planeta_2.setDistanciaSol(1426666422);
        planeta_2.setTipoPlaneta();
        planeta_2.setObservable(false);
        planeta_2.imprimir();
        planeta_2.densidad();
        planeta_2.exteriorono();
    }
}
