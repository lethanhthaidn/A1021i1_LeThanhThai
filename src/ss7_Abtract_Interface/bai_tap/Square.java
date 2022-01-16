package ss7_Abtract_Interface.bai_tap;

import ss6_Inheritance.thuc_hanh.Rectangle;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getSide() {
        return getWidth();
    }


    @Override
    public String toString() {
        return "A Square with side=" + getSide() + "which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*percent/100);
    }
}


