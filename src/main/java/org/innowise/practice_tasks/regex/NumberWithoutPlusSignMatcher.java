package org.innowise.practice_tasks.regex;

import java.util.regex.Pattern;

public class NumberWithoutPlusSignMatcher {
    private static final String NUMBER_NOT_FOLLOWED_BY_PLUS_REGEX = "\\b\\d+(?!\\+)\\b";
    private static final Pattern PATTERN = Pattern.compile(NUMBER_NOT_FOLLOWED_BY_PLUS_REGEX);

    public static boolean isNumberNotFollowedByPlus(String text) {
        return PATTERN.matcher(text).find();
    }
}