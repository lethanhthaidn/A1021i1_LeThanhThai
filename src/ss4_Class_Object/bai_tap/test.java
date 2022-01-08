package ss4_Class_Object.bai_tap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("-- nhap a: ");
        double a =scanner.nextDouble();
        System.out.print("-- nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("-- nhap c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("*** The equation has no real roots.");

        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("*** The equation has 2 roots: " + quadraticEquation.getRoot1() +
                    "," + quadraticEquation.getRoot2());

        } else
            System.out.println("*** The equation has 1 root: " + quadraticEquation.getRoot1());
    }
}
