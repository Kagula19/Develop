public class Articoli {
    public String nome;
    public double prezzo;

    public Articoli(String nome, double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Articoli{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
