package ss4_Class_Object.thuc_hanh;

import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- nhap chieu rong: ");
        double width = scanner.nextInt();
        System.out.println("-- nhap chieu dai: ");
        double height = scanner.nextInt();

        rectangle rectangle = new rectangle(width, height);
        System.out.println("Hinh chu nhat cua ban: " + rectangle.display());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
    }
}
