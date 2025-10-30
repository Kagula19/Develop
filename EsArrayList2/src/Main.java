import java.util.*;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){

        Studente studente1 = new Studente("Dario", 15);
        Studente studente2 = new Studente("Francesco", 12);
        Studente studente3 = new Studente("Totto", 15);
        Studente studente4 = new Studente("Lele", 18);
        Studente studente5 = new Studente("Lollo", 19);
        Studente studente6 = new Studente("Bobby", 13);
        Studente studente7 = new Studente("Davide", 15);
        Studente studente8 = new Studente("Gabriel", 12);
        Studente studente9 = new Studente("Simone", 15);
        Studente studente10 = new Studente("Alessandro", 18);
        Studente studente11 = new Studente("Emanuel", 19);
        Studente studente12 = new Studente("Rayane", 13);

        List<Studente> lista1 = new ArrayList<>();
        lista1.add(studente1);
        lista1.add(studente2);
        lista1.add(studente3);
        lista1.add(studente4);
        lista1.add(studente5);
        lista1.add(studente6);
        lista1.add(studente7);
        lista1.add(studente8);
        lista1.add(studente9);
        lista1.add(studente10);
        lista1.add(studente11);
        lista1.add(studente12);

        System.out.println("lista: " + lista1);


        Collections.sort(lista1, Comparator.comparingInt(Studente::getEta));

        System.out.println("lista dopo: " + lista1);
    }

}
