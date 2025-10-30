public class Fruit {
    public String nome;

    public Fruit(String nome){
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
