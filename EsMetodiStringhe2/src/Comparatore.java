public class Comparatore {
    public String cod;
    public int pos;

    public Comparatore(String cod, int pos) {
        this.cod = cod;
        this.pos = pos;
    }

    public void estrattore(){
        StringBuilder ris =  new StringBuilder();
        if (pos > cod.length() || pos < 0){
            ris.append("Errore");
            System.out.println(ris);
        }else{
            ris.append(cod.codePointAt(pos));
            System.out.println(ris);
        }
    }
}
