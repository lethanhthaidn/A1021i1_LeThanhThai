package ss14_Sort.Thuc_hanh;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        boolean swap = true;
        for (int i = 0; i < list.length && swap; i++) {
            swap = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    swap = true;
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        for (int num : list) {
            System.out.print(num + ", ");
        }
    }
}
