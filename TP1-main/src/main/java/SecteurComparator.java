import java.util.Comparator;

public class SecteurComparator implements Comparator<Secteur> {

    public int compare(Secteur premierSecteur, Secteur secondSecteur){
        return Integer.compare(premierSecteur.getNombreAnimaux(),secondSecteur.getNombreAnimaux());
    }
}
