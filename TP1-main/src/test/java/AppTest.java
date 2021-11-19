import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class AppTest {

    @Test
    public void testNombreMaxOK() {
        Zoo zoo = new Zoo();
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Exception exc = null;
        try {
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();

        } catch (LimiteVisiteurException e) {
            exc = e;
        }
        assertNull(exc);
    }

    @Test
    public void testNombreMaxKO() {
        Zoo zoo = new Zoo();
        zoo.ajouterSecteur(TypeAnimal.CHAT);
        Exception exc = null;
        try {
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();
            zoo.nouveauVisiteur();

        } catch (LimiteVisiteurException e) {
            exc = e;
        }
        assertNotNull(exc);
        assertEquals(LimiteVisiteurException.class, exc.getClass());
    }

    @Test
    public void testNombreMaxAnimauxComparator(){
        Zoo zoo = new Zoo();
        System.out.println("Test");

        Secteur s1 = new Secteur(TypeAnimal.CHAT);
        Secteur s2 = new Secteur(TypeAnimal.CHIEN);

        Chat c1 = new Chat("Chat 1",TypeAnimal.CHAT);
        Chat c2 = new Chat("Chat 2",TypeAnimal.CHAT);
        Chien ch1 = new Chien("Chien 1",TypeAnimal.CHIEN);

        zoo.ajouterSecteur(TypeAnimal.CHAT);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);

        zoo.nouvelAnimal(s1,c1);
        zoo.nouvelAnimal(s1,c2);
        zoo.nouvelAnimal(s2,ch1);

        SecteurComparator secteurComparator = new SecteurComparator();
        if(secteurComparator.compare(s1,s2) == 1){
            System.out.println("Le secteur s1 possède le plus d'animaux");
        }
        else if(secteurComparator.compare(s2,s1) == 1){
            System.out.println("Le secteur s2 possède le plus d'animaux");
        }
        else if(secteurComparator.compare(s1,s2) == 0){
            System.out.println("Les secteurs ont le même nombre d'animaux");
        }
    }

    @Test
    public void testNombreAnimauxComparable(){
        Zoo zoo = new Zoo();
        System.out.println("Test");

        Secteur s1 = new Secteur(TypeAnimal.CHAT);
        Secteur s2 = new Secteur(TypeAnimal.CHIEN);

        Chat c1 = new Chat("Chat 1",TypeAnimal.CHAT);
        Chat c2 = new Chat("Chat 2",TypeAnimal.CHAT);
        Chien ch1 = new Chien("Chien 1",TypeAnimal.CHIEN);

        zoo.ajouterSecteur(TypeAnimal.CHAT);
        zoo.ajouterSecteur(TypeAnimal.CHIEN);

        zoo.nouvelAnimal(s1,c1);
        zoo.nouvelAnimal(s1,c2);
        zoo.nouvelAnimal(s2,ch1);

        if(s1.compareTo(s2) == 1){
            System.out.println("Le secteur s1 possède le plus d'animaux");
        }
        else if(s2.compareTo(s1) == 1){
            System.out.println("Le secteur s2 possède le plus d'animaux");
        }
        else if(s1.compareTo(s2) == 0){
            System.out.println("Les secteurs ont le même nombre d'animaux");
        }
    }
}