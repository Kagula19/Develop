public class ShapeFactory {
    public static Shape getShape(Shapes tipo) {
        switch (tipo) {
            case Cerchio:
                return new Cerchio();
            case Rettangolo:
                return new Rettangolo();
            default:
                return null;
        }
    }
}