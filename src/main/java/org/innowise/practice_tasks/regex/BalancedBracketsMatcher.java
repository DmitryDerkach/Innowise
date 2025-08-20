package org.innowise.practice_tasks.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BalancedBracketsMatcher {

    public static boolean hasBalancedBrackets(String expression) {
        Pattern pattern = Pattern.compile("\\(([^\\(]*?\\))*");
        Matcher matcher = pattern.matcher(expression);
        int openBrackets = 0;
        int closeBrackets = 0;

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else if (c == ')') {
                closeBrackets++;
            }
        }

        return openBrackets == closeBrackets;
    }

}
