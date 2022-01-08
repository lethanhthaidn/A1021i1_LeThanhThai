package ss3_Mang_Method.thuc_hanh;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {


        String[] sinhVien = {"Thai", "Nguyen", "Dieu", "Quynh", "Trang"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten sinh vien: ");
        String input = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < sinhVien.length; i++) {
            if (sinhVien[i].equals(input)) {
                check = true;
                System.out.println("--- Vi tri cua sinh vien " + input + " la: " + (i + 1));
                break;
            }
        }
        if(!check)
            System.out.println("--- Khong tim thay sv trong danh sach.");
    }
}