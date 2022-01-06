package ss3_Mang_Method.bai_tap;

import java.util.Scanner;

public class countStudents {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("--nhap so luong sinh vien: ");
        size = scanner.nextInt();
        int[] sinhVien = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("--nhap diem sinh vien " + (i + 1) + ": ");
            sinhVien[i] = scanner.nextInt();
        }
        System.out.println("danh sach diem: ");
        for (int i = 0; i < size; i++) {
            System.out.println("sinhvien"+(i+1)+ ": " + sinhVien[i] + " diem");
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (sinhVien[i] >= 5) {
                count ++;
            }
        }
        System.out.println("--so sinh vien thi do: " + count);
    }
}
