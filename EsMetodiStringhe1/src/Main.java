
void main() {
    String frase1 = "ciao";
    String frase2 = "ciao";
    if (frase1.compareTo(frase2) == 0){
        StringBuffer ris = new StringBuffer("Le due stringhe sono uguali");
        System.out.println(ris);
    } else {
        StringBuffer ris = new StringBuffer("Le due stringhe sono differenti");
        System.out.println(ris);
    }
}

