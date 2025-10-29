import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<String> Insieme = new HashSet<String>();

        Riempi(4, Insieme);
        System.out.println("Prima: " + Insieme);

        String g = "g";

        Insieme.add(g);
        System.out.println("Dopo: " +Insieme);

        CheckElimina(Insieme, g);
        System.out.println("DopoElimina: " +Insieme);
    }
    public static void Riempi(int index, Set y){
        for(int x = 0; x < index; x++){
            y.add(String.valueOf(x));
        }
    }
    public static void CheckElimina(Set y, String oggettoDaEliminare){
        Iterator<String> iterator = y.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if(element == oggettoDaEliminare){
                iterator.remove();
            }
        }
    }
}
