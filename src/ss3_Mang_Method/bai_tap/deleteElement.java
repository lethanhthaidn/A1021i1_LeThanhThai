package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 8, 9};
        int X;

        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap phan tu can xoa: ");
        X = scanner.nextInt();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == X) {
                System.out.println("so vua nhap o vi tri: " + i);
                check = true;
                for (int j = i; j <array1.length -1  ; j++) {
                    array1[j] = array1[j+1];
                }
            }
        }
        if (!check) {
            System.out.println("not found!");
        }else{
            System.out.print("mang sau khi xoa: ");
            for (int i = 0; i < array1.length -1 ; i++) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}