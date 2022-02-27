package ss19_String_Regex.Bai_tap.p1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassRegex {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAMECLASS_REGEX = "[CAP]\\d{4}\\w*[GHIKLM]";
    public NameClassRegex() {
        pattern = Pattern.compile(NAMECLASS_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
