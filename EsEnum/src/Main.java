
void main() {
    Rettangolo rettangolo = new Rettangolo(10.5,5, Forma.OggettoGeometrico.Rettangolo);
    Triangolo triangolo = new Triangolo(10, 2, Forma.OggettoGeometrico.Triangolo);
    triangolo.calcolaArea();
    rettangolo.calcolaArea();
}
