public class Main{
    public static void main(String[] args){
        Controllo(5);

    }
    public static void Controllo(int x){
        try{
            int ris = x/0;
            System.out.println(ris);
        } catch (ArithmeticException e){
            System.out.println("Errore " + e);
        }
    }
}
