package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class addElement {
    public static void main(String[] args) {
        int[] arr;
        int X;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich thuoc mang: ");
        int size = scanner.nextInt();
        arr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            System.out.print("nhap phan tu " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("mang vua nhap la: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nnhap so can chen: ");
        X = scanner.nextInt();
        System.out.println("vi tri muon chen: ");
        index = scanner.nextInt();
        if (index < 0 || index > size) {
            System.out.println("khong chen duoc.");
        }else{
            for (int i = size; i >index ; i--) {
                arr[i] = arr[i-1];
            }
            arr[index] = X;
        }
        System.out.print("mang sau khi chen: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
