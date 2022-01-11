package ss5_access_modifier.thuc_hanh;

public class Students {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public Students() {
    }



    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "Codegym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
