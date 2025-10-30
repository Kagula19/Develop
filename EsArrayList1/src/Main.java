import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        Studente studente1 = new Studente("Dario", 15);
        Studente studente2 = new Studente("Francesco", 12);

        List<Studente> lista1 = new ArrayList<>();
        lista1.add(studente1);
        lista1.add(studente2);

        System.out.println("lista: " + lista1);

        Studente studente3 = new Studente("Totto", 15);
        Studente studente4 = new Studente("Lele", 18);
        Studente studente5 = new Studente("Lollo", 19);
        Studente studente6 = new Studente("Bobby", 13);
        lista1.add(studente3);
        lista1.add(studente4);
        lista1.add(studente5);
        lista1.add(studente6);
        System.out.println("lista dopo: " + lista1);
    }

}
