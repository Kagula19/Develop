public class Main{
    public static void main(String[] args){
        //Autoboxing e Unboxing
        int x = 4;
        double y = 2.5;
        char z = 'c';

        Integer X = 4;
        Double Y = 2.5;
        Character Z = 'V';

        int xx = X;
        double yy = Y;
        char zz = Z;

        System.out.println("Es1:" + Es1(x,x));
        System.out.println("Es2:" + Es2(z));
        System.out.println("Es3:" + Es3(X, X));
        System.out.println("Es4:" + Es4(Z));



    }
    public static Integer Es1(int x, int y){
        return x + y;
    }
    public static Character Es2(char x){
        return x;
    }
    public static int Es3(Integer x, Integer y){
        return x + y;
    }
    public static char Es4(Character x){
        return x;
    }
}
