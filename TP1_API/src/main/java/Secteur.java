import java.util.ArrayList;
import java.util.List;

public class Secteur {

    List<String> animauxDansSecteur = new ArrayList<>();
    String typeAnimauxDansSecteur;

    public Secteur(String secteur){
        typeAnimauxDansSecteur = secteur;
    }

    public void ajouterAnimal(Animal a){

    }

    public int getNombreAnimaux(){
        return 0;
    }

    public String obtenirType(){
        return "test";
    }
}
