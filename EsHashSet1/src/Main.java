import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Set<String> Insieme = new HashSet<String>();
        Insieme.add("S");
        Insieme.add("l");
        System.out.println("Grandezza: " + Insieme.size());
        for(String element: Insieme){
            System.out.println("Elemento: " + element);
        }
    }
}
