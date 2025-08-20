package org.innowise.practice_tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlColorCodeMatcher {

    public static boolean isValidHtmlColorCode(String colorCode) {
        Pattern pattern = Pattern.compile("^#([0-9A-Fa-f]{6})$");
        Matcher matcher = pattern.matcher(colorCode);
        return matcher.matches();
    }
}
