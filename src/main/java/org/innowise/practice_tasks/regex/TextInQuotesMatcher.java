package org.innowise.practice_tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextInQuotesMatcher {

    public static boolean hasTextInQuotes(String text) {
        Pattern pattern = Pattern.compile("\"([^\"]*)\"");
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Text in quotes: " + matcher.group(1));
            found = true;
        }
        return found;
    }

}
