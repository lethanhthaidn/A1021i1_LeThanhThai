package ss8_CleanCode.mvc.model.repository;

import ss8_CleanCode.mvc.model.model.Student;

public class StudentRepository implements IStudentRepository {
    public static Student[] students = new Student[20];

    static {
        students[0] = new Student(1, "HaiTT", "1998-01-01", 9);
        students[1] = new Student(2, "NguyenDDB", "1992-01-01", 8);
        students[2] = new Student(3, "QuocNNA", "1998-01-01", 10);
    }
    @Override
    public Student[] getAll() {
        return students;
    }

    @Override
    public void add(Student student) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
        System.out.println("danh sach moi:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }else
                System.out.println(students[i]);
        }

    }

    @Override
    public void delete(int codeStudent) {

        for (int i = 0; i < students.length; i++) {
            //int tempt = students[i].getCodeStudent();
            if (students[i].getCodeStudent() == codeStudent) {
                students[i] = null;
                break;
            }
        }
        System.out.println("Dsach sau khi xoa: ");
//        Student[] students = getAll();
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }

        }
    }
}
