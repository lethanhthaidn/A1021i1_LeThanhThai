package ss7_Abtract_Interface.bai_tap;

public class TestResize {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Before resize: " + circle.getArea());
        circle.resize(50);
        System.out.println("After resize: " + circle.getArea());

        System.out.println(circle.getArea1());
    }
}
