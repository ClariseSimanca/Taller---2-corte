package mains;
import objetos.Animal;
import objetos.Gatos;
import objetos.Leones;
import objetos.Lobos;
import objetos.Perros;

public class MainAnimales {
    public static void main(String[] args) {
        
      Animal[] animales;
      animales = new Animal[4];
      
      animales[0] = new Gatos();
      animales[1] = new Leones();
      animales[2] = new Perros();
      animales[3] = new Lobos();   
      
        for (int i = 0; i < animales.length; i++) {
            System.out.println(animales[i].getNombreCientifico());
            System.out.println(animales[i].getHabitat());
            System.out.println(animales[i].getAlimento());
            System.out.println(animales[i].getSonido());
                    
        }
    }    
}
