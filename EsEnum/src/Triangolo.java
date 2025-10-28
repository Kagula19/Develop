public class Triangolo extends Forma{
    private double base;
    private double altezza;
    private OggettoGeometrico oggetto;

    public Triangolo(double base, double altezza, OggettoGeometrico oggetto) {
        this.base = base;
        this.altezza = altezza;
        this.oggetto = oggetto;
    }

    @Override
    public void calcolaArea() {
        double area = (base * altezza)/2;
        System.out.println("Area: " + area);
        System.out.println("Tipo geometrico: " + oggetto);
    }
}
