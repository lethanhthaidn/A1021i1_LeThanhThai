package ss8_CleanCode.mvc.controller;

import ss8_CleanCode.mvc.model.service.IStudentService;
import ss8_CleanCode.mvc.model.service.StudentService;

import java.util.Scanner;

public class StrudentController {
    public static void main(String[] args) {
        IStudentService iStudentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chào mừng đến với CT quản lý học sinh");
        System.out.println("-------------------------------------");

        System.out.println("1. Hiển thị danh sách học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Xóa học sinh");
        System.out.print("Mời bạn nhập chức năng: ");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                iStudentService.display();break;
            case 2:
                iStudentService.add();break;
            case 3:
                iStudentService.delete();break;
        }

    }
}
