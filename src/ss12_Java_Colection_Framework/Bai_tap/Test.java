package ss12_Java_Colection_Framework.Bai_tap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javafx.application.Platform.exit;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public static void main(String[] args) {
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("1. Them\n2. Chinh sua\n3. Xoa\n4. Hien thi danh sach\n5. Tim kiem theo ten\n6. Sap xep theo gia\n7. Thoat.");
        int choice = 0;
        do {
            System.out.print("Vui long nhap chuc nang (1-6): ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice < 1 || choice > 7);
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                edit();
                break;
            case 3:
                delete();
                break;
            case 4:
                display();
                break;
            case 5:
                search();
                break;
//            case 6:
//                sort();
//                break;
            case 7:
                exit();
                break;

        }
        displayMainMenu();
    }

    private static void create() {
        System.out.print("Id: ");
        int id = parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, id, price);

        productService.add(product);

        System.out.println("Them thanh cong!");
    }

    private static void display() {
        List<Product> productsList = productService.getAll();
        for (int i = 0; i < productsList.size(); i++) {
            System.out.println(productsList.get(i));
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void edit() {

        System.out.print("Id can sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap lai ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap lai gia: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, id, price);

        productService.update(product);
        System.out.println("Chinh sua thanh cong!");
    }

    private static void delete() {
        System.out.print("Nhap Id can xoa:");
        int id = Integer.parseInt(scanner.nextLine());

        productService.delete(id);
        System.out.println("Xoa thanh cong!");
    }

    private static void search() {
        System.out.print("Nhap ten can tim: ");
        String name = scanner.nextLine();
        Product product = productService.search(name);
        System.out.println("Name: " + product.getName() + ", Id: " + product.getId() + ", Price: " + product.getPrice());
    }

}
