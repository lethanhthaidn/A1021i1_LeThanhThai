package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so dong ma tran: ");
        row = scanner.nextInt();
        System.out.print("nhap vao so cot ma tran: ");
        col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("nhap cac phan tu cho ma tran: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix [" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma tran vua nhap la: ");

            for (int j = 0; j < col; j++) {
                System.out.print(matrix[0][j] + "\t");
            }
        System.out.println();
        for (int j = 0; j < col; j++) {
            System.out.print(matrix[1][j] + "\t");
        }
        System.out.println();

        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("max is: " + max);

    }
}
