package org.innowise.practice_tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FractionalNumbersMatcher {

    public static boolean hasFractionalNumber(String text) {
        Pattern pattern = Pattern.compile("\\d*[.]\\d+");
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("Fractional number found: " + matcher.group());
            found = true;
        }
        return found;
    }

}
