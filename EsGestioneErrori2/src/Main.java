public class Main{
    public static void main(String[] args){
        System.out.println(Controllo('1'));

    }
    public static boolean Controllo(char x){
        try{
            if(Character.isDigit(x)){
                return true;
            } else {
                throw new ArithmeticException("Out");

            }
        } catch (ArithmeticException e){
            System.out.println("Questo non è un numero " + e);
            return false;
        }
    }
}
