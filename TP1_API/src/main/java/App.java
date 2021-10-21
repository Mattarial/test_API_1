public class App {

    static Zoo zoo = new Zoo();

    public static void main(String[] args){

        zoo.ajouterSecteur("C");
        zoo.ajouterSecteur("F");

        Chien c1 = new Chien("test_c1", "test_c");
        Chat f1 = new Chat("test_f1", "test_f");

        zoo.nouvelAnimal(c1);
        zoo.nouvelAnimal(f1);


    }
}
