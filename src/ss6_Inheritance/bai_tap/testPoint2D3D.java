package ss6_Inheritance.bai_tap;


public class testPoint2D3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2, 3);
        System.out.println(point2D);
        point2D.setXY(5, 6);
        System.out.println(point2D);

        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println(point3D);
    }

}
