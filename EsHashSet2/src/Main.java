import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<String> Insieme = new HashSet<String>();

        Riempi(4, Insieme);
        System.out.println("Prima: " + Insieme);

        String g = "g";
        boolean contiene = Insieme.contains(g);
        System.out.println("Elemento già presente? : " + contiene);


        Insieme.add(g);
        System.out.println("Dopo: " +Insieme);



    }
    public static void Riempi(int index, Set y){
        for(int x = 0; x < index; x++){
            y.add(x);
        }
    }
}
