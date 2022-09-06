package dayOne.shapes;

public class ShapeFactory {
    public static void main(String[] args) {
        Circle circle = new Circle(30.0);
        Square square = new Square(4.5, 4.5);
        //invoke or call or use the method on the object

        System.out.println(square.calculateArea());
    }
}
