package ss2_Loop_java.bai_tap;

import java.util.Scanner;

public class isprimenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = scanner.nextInt();
        System.out.println("cac snt nho hon " + n + "la: ");
        if (n >= 2) {
            System.out.print(2);

        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
