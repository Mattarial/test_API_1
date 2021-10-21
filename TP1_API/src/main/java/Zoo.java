import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    int visiteur;
    List<String> secteurAnimaux = new ArrayList<>();

    public Zoo(){

    }

    public void ajouterSecteur(String secteur){
        secteurAnimaux.add(secteur);
    }

    public void nouveauVisiteur(){

    }

    public int getLimiteVisiteur(){
        return 0;
    }

    public void nouvelAnimal(Animal a){

    }

    public int nombreAnimaux(){
        return 0;
    }

}
