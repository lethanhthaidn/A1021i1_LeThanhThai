package ss5_access_modifier.bai_tap;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Thai");
        student.setClasses("A1021i1");
        System.out.println(student.setName());
        System.out.println(student.setClasses());
    }
}
