import java.util.*;

public class Main{
    public static void main(String[] args){

        Articoli articolo1 = new Articoli("Penna", 15.5);
        Articoli articolo2 = new Articoli("Pizza", 12.4);
        Articoli articolo3 = new Articoli("Fanta", 2.4);

        Map<String, Articoli> categoria = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Oggetti", articolo1),
                new AbstractMap.SimpleEntry<>("Cibo", articolo2),
                new AbstractMap.SimpleEntry<>("Bibite", articolo3)
        );

        List<String> ordina = new ArrayList<>(categoria.keySet());
        Collections.sort(ordina);

        System.out.println("categoria: " + ordina);

    }

}
