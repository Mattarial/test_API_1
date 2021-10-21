import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    int visiteur;
    List<Secteur> secteurAnimaux = new ArrayList<>();

    public Zoo(){

    }

    public void ajouterSecteur(Secteur secteur){
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
