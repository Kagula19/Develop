public class Main{
    public static void main(String[] args){
        Builder builder1 = new Builder();
        builder1.setFirstName("Rossi");
        builder1.setLastName("Alessandro");
        Person persona1 = builder1.build();

        System.out.println(persona1);
        Builder builder2 = new Builder();
        builder2.setFirstName("Rossi");
        builder2.setLastName("Marcello");
        Person persona2 = builder2.build();

        System.out.println(persona2);

    }
}