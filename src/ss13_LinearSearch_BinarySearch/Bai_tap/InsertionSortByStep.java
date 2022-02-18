package ss13_LinearSearch_BinarySearch.Bai_tap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
//            System.out.print("compare" + list[j + 1] + "=" + list[j]);
            while (j >= 0 && list[j] > key) {

                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;

            System.out.println("\nList after the  " + i + "' sort: ");
            for (int num : list) {
                System.out.print(num + ", ");
            }
        }
    }
}