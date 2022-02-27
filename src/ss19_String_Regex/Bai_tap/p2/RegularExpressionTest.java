package ss19_String_Regex.Bai_tap.p2;

public class RegularExpressionTest {
    static RegularExpression regularExpression;
    static final String[] valid = new String[]{"(84)-(0978489648)", "(84)-(0978589648)", "(84)-(0978489648)"};
    static final String[] invalid = new String[]{"(a8)-(2222222222)", "(a8)-(2222222222)", "(a8)-(2222222222)"};

    public static void main(String[] args) {
        regularExpression = new RegularExpression();
        for (String number : valid) {
            boolean isvalid = regularExpression.validate(number);
            System.out.println("Number: " + number + " isvalid " + isvalid);
        }
        for (String number : invalid) {
            boolean isvalid = regularExpression.validate(number);
            System.out.println("Number: " + number + " isvalid " + isvalid);
        }
    }
}


