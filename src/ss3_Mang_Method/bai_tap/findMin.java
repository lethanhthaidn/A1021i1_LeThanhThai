package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap size mang: ");
        size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("mang vua nhap la: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int Min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < Min) {
                Min = arr[i];
            }
        }System.out.println("\nMin = " + Min);
    }
}
