package objetos;

public class Gatos extends Felinos {

    @Override
    public String getNombreCientifico() {
        return "Felis Silvestris Catus";
    }

    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getAlimento() {
        return "Ratones";
    }
    
}
