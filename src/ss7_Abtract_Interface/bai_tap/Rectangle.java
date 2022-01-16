package ss7_Abtract_Interface.bai_tap;

import ss6_Inheritance.thuc_hanh.Shape;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(double side) {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(double side) {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        width*= percent/100;
        length*= percent/100;
    }
}
