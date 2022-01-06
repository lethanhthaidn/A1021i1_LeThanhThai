package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class sumCol {
    public static void main(String[] args) {
        int col;
        int[][] sumCol;
        Scanner scanner = new Scanner(System.in);
//        System.out.print("--nhap so dong: ");
//        row = scanner.nextInt();
        System.out.print("--nhap so cot: ");
        col = scanner.nextInt();
        sumCol = new int[2][col];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("--nhap phan tu [" + i + "]" + "[" + j + "]: ");
                sumCol[i][j] = scanner.nextInt();
            }
        }
        System.out.println("--> mang vua nhap la: ");
        for (int i = 0; i < col; i++) {
            System.out.print(sumCol[0][i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < col; i++) {
            System.out.print(sumCol[1][i] + "\t");
        }

        int value;
        int sum = 0;
//        System.out.print("\n--nhap so cot muon tinh tong: ");
//        value = scanner.nextInt();
        do {
            System.out.print("\n--nhap so cot muon tinh tong: ");
            value = scanner.nextInt();
        } while (value > col);
        for (int i = 0; i < 2; i++) {

            sum += sumCol[i][value];

        }

        System.out.println("--> tong cot " + value + " = " + sum);

    }
}
