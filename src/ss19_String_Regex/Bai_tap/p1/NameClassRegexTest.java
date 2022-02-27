package ss19_String_Regex.Bai_tap.p1;

public class NameClassRegexTest {
    static NameClassRegex nameClassRegex;
    public static final String[] validName = new String[]{"C0318G", "C0319G", "C1234G"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A", "R0323R"};

    public static void main(String[] args) {

        nameClassRegex = new NameClassRegex();
        for (String name : validName) {
            boolean isvalid = nameClassRegex.validate(name);
            System.out.println("Acount is " + name + "is valid: " + isvalid);
        }

        for (String name : invalidName) {
            boolean isvalid = nameClassRegex.validate(name);
            System.out.println("Account is " + name + " is valid: " + isvalid);
        }
    }
}
