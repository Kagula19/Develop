import java.util.*;
import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<Fruit> frutti = new LinkedList<>();
        frutti.add(new Fruit("Banana"));
        frutti.add(new Fruit("Mela"));


        System.out.println("frutti: " + frutti);

        frutti.addFirst(new Fruit("Pera"));
        frutti.addLast(new Fruit("Kiwi"));
        System.out.println("frutti aggiornati: " + frutti);
    }

}
