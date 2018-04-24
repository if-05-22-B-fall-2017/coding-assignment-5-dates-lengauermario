import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    private static final Pattern pattern = Pattern.compile("^([12]?\\d|3[01]|[1-9])[. :\\-](0?[1-9]|1[0-2])[. :\\-](19|20)?\\d{2}$");
    public static Matcher getMatcher(String dateString) {
        return pattern.matcher(dateString);
    }
}
