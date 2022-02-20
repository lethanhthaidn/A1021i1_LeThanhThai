package ss15_Exception.Thuc_hanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = arrayExample.createRandom();
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        while (true) {
//            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
            int x = scanner.nextInt();

            try {
                if (x<0){
                    throw new Exception("Phải là số dương");
                }
                System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);

                break;
            } catch (Exception e) {
                e.printStackTrace();
//                System.out.println(e.getMessage());
//                System.err.println("Chỉ số vượt quá giới hạn của mảng" + e.getMessage());
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
            System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        }
    }
}}