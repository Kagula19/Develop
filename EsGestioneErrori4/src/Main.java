public class Main{
    public static void main(String[] args){
        int[] numeri = {2,5,3,2,2};
        Controllo(numeri,6);
        Controllo(numeri,2);
    }
    public static void Controllo(int[] array , int index){
        try{
            int ris = array[index] / 0;
            System.out.println(ris) ;

        } catch (ArithmeticException e){
            System.out.println("Errore " + e.getMessage());
        } catch (IndexOutOfBoundsException x){
            System.out.println("Errore " + x.getMessage());
        }
    }
}
