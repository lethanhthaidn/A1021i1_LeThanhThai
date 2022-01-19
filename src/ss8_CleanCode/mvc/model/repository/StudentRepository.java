package ss8_CleanCode.mvc.model.repository;

import ss8_CleanCode.mvc.model.model.Student;

public class StudentRepository implements IStudentRepository{
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
    public Student[] add() {
        return new Student[3];
    }


}
