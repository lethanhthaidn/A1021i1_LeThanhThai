package ss2_Loop_java.bai_tap;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        while(true){
            //System.out.println("Shape: ");
            System.out.println("1. Print rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print  isosceles triangle");
            System.out.println("4. Exit");

            System.out.println("chosse the number:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 9; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i = 7; i >=1 ; i--) {
                        for (int j = 1; j <i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        }
    }
}
