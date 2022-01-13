package ss6_Inheritance.thuc_hanh;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }
////    public double getSide() {
////        return getWidth();
//    }
    public void setSide(double side) {
        getWidth(side);
        getLength(side);
    }

}
