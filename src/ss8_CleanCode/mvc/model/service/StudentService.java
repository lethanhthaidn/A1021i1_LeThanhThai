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

        Student[] students = iStudentRepository.add();
        students[3] =new Student(code, name, date, point);

    }

    @Override
    public void delete() {

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
