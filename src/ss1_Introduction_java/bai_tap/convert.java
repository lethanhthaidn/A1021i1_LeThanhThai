package ss1_Introduction_java.bai_tap;

import java.util.Scanner;

public class convert {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter usd: ");
        int usd = input.nextInt();
        int vnd = 23000 * usd;
        System.out.println("vnd is: " + vnd);
    }
}
