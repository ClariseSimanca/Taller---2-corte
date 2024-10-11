
package objetos;

public class Perros extends Canidos {
   
    @Override
    public String getNombreCientifico() {
       return "Canis Lupus Familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getHabitat() {
        return"Domestico";
    }

    @Override
    public String getAlimento() {
        return "Carnivora";
    }
}
