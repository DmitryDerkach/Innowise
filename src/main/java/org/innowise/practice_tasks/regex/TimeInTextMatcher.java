package org.innowise.practice_tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeInTextMatcher {

    public static boolean isValidTime(String text) {
        Pattern pattern = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
