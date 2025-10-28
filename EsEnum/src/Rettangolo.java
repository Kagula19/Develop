public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    private OggettoGeometrico oggetto;

    public Rettangolo(double base, double altezza, OggettoGeometrico oggetto) {
        this.base = base;
        this.altezza = altezza;
        this.oggetto = oggetto;
    }



    @Override
    public void calcolaArea() {
        double area = base * altezza;
        System.out.println("Area: " + area);
        System.out.println("Tipo geometrico: " + oggetto);
    }
}
