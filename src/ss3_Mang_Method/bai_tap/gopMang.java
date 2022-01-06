package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so luong phan tu mang 1: ");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i <arr1.length; i++) {
            System.out.print("nhap phan tu " + (i+1) + " :");
            arr1[i]= scanner.nextInt();
        }
        System.out.print("mang 1 la: ");
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.print("\nnhap so luong phan tu mang 2: ");
        size2 = scanner.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("nhap phan tu " + (i+1) + " :");
            arr2[i] = scanner.nextInt();
        }
        System.out.print("mang 2 la: ");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] arr3;
        int size3 = size1 + size2 ;
        arr3=new int[size3];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[index] = arr1[i];
            index++;
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[index] = arr2[i];
            index++;
        }
        System.out.println("mang 3 (mang 1 + 2) la: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
