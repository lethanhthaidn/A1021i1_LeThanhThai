package ss15_Exception.Bai_tap;

import java.util.Scanner;

public class TriangleException {
    public static <IllegalTriangleException> void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Cạnh a: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Cạnh b: ");
            b = Integer.parseInt(scanner.nextLine());
            System.out.print("Cạnh c: ");
            c = Integer.parseInt(scanner.nextLine());
            int perimeter = a + b + c;

            try {
                if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                    throw new Exception("Bạn đã nhập số âm, mời bạn nhập lại.");
                } else
                    System.out.print("Perimeter: " + perimeter);break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}