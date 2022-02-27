package ss19_String_Regex.Bai_tap.p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NUMBER = "\\(\\d{2}\\)-\\(0\\d{9}\\)";

    public RegularExpression() {
        pattern = Pattern.compile(NUMBER);
    }

    boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
