public class Main{
    private static User db;
    public static User getDb(){
        if (db == null){
            db = new User();
        }
        return db;
    }
    public static void main(String[] args){
        User persona1 = getDb();
        System.out.println(persona1);
        User persona2 = getDb();
        persona2.setNome("Gigi");
        persona2.setEta(3);
        System.out.println(persona2);
    }
}