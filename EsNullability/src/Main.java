public class Main{
    public static void main(String[] args){
        Integer n1 = null;
        Integer n2 = 5;
        Controllo(n1, n2);
    }
    public static void Controllo(Integer numeratore, Integer denominatore){
        try{
            if (numeratore == null || denominatore == null){
                throw new NullPointerException();
            }else {
                Integer ris = numeratore / denominatore;
                System.out.println("Risultato è "+ ris);
            }
        } catch (NullPointerException e){
            System.out.println("Errore " + e.getMessage());
        }
    }
}
