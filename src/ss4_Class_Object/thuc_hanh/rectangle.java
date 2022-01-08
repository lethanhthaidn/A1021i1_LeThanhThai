package ss4_Class_Object.thuc_hanh;

public class rectangle {
    double width, height;

    public rectangle() {
    }

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hinh chu nhat {" + "Chieu rong: " + width + ", Chieu dai: " + height + "}";
    }
}
