enum Shapes {
    Cerchio,
    Rettangolo
    }

public class Main{
    public static void main(String[] args){
        Shape cerchio = ShapeFactory.getShape(Shapes.Cerchio);
        Shape rettangolo = ShapeFactory.getShape(Shapes.Rettangolo);
        cerchio.draw();
        rettangolo.draw();

    }
}
