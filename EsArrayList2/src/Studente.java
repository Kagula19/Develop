public class Studente {
    public String nome;
    public int eta;

    public Studente(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
