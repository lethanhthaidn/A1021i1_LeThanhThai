package ss6_Inheritance.bai_tap;

public class TestPoint {
    public static void main(String[] args) {
        MovablePoint movable = new MovablePoint(1,2,3,4);
        System.out.println(movable);
        System.out.println(movable.move());
    }
}
