package ss8_CleanCode.mvc.model.service;

import ss8_CleanCode.mvc.model.model.Student;
import ss8_CleanCode.mvc.model.repository.IStudentRepository;
import ss8_CleanCode.mvc.model.repository.StudentRepository;

import java.util.Scanner;

import static ss8_CleanCode.mvc.model.repository.StudentRepository.students;

public class StudentService implements IStudentService {
    private IStudentRepository iStudentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("date of birth: ");
        String date = scanner.nextLine();
        System.out.println("point: ");
        double point = Double.parseDouble(scanner.nextLine());

        Student newStudent = new Student(code, name, date, point);
        iStudentRepository.add(newStudent);
    }

    @Override
    public void delete() {
        System.out.println("Nhap code hs muon xoa: ");
        int newCode = Integer.parseInt(scanner.nextLine());
        iStudentRepository.delete(newCode);
//        int length = students.length;
//        for (int i = 0; i < students.length; i++) {
//            int tempt = students[i].getCodeStudent();
//            if (students[i].getCodeStudent() == newCode) {
//                students[i] = nmmull;
//                break;
//            }
//        }
//        System.out.println("Dsach sau khi xoa: ");
//        Student[] students = iStudentRepository.getAll();
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) {
//                System.out.println(students[i]);
//            }
//
//        }

    }
    @Override
    public void display() {
        Student[] students = iStudentRepository.getAll();
        for (Student student : students) {
            if (student == null)
                break;
            else
                System.out.println(student);
        }
    }
}
