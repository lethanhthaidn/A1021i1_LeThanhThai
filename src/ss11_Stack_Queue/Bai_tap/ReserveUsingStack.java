package ss11_Stack_Queue.Bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReserveUsingStack {
    public static void main(String args[]) {
        Integer[] a = new Integer[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 4;
        int size = a.length;
        System.out.println("Arrays before inserve:");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            stack.add(a[i]);
        }
        System.out.println("After inserve:");
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }
}