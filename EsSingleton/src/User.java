public class User {
    private String nome;
    private int eta;

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", eta='" + eta + '\'' +
                '}';
    }
    public User() {
        this.nome = "Rossi";
        this.eta = 18;
    }
    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
}
