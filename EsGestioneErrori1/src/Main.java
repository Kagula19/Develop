public class Main{
    public static void main(String[] args){
        System.out.println(ControlloRange(0,1,10));

    }

    public static boolean ControlloRange(int numero, int min, int max){
        try{
            if(numero < min || numero > max){
                throw new ArithmeticException("Out");
            } else {
                return true;
            }
        } catch (ArithmeticException e){
            System.out.println("Il numero è fuori range " + e);
            return false;
        }
    }
}
