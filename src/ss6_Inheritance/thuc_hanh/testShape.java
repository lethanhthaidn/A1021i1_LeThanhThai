package ss6_Inheritance.thuc_hanh;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);


        Circle circle = new Circle("blue", false, 3.5);
        System.out.println(circle);

        Rectangle rect = new Rectangle(2.5, 3.5);
        System.out.println(rect);
        rect = new Rectangle("yellow", true, 2, 3);
        System.out.println(rect);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        Square square = new Square(3.5);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
