package ss5_access_modifier.thuc_hanh;

public class testStudents {
    public static void main(String[] args) {
        Students.change();
        Students[] students = new Students[3];
        students[0] = new Students(111, "Hoang");
        students[1] = new Students(222, "Khanh");
        students[2] = new Students(333, "Nam");
//        Students s1 = new Students(111, "Hoang");
//        Students s2 = new Students(222, "Khanh");
//        Students s3 = new Students(333, "Nam");
//        s1.display();
//        s2.display();
//        s3.display();
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
