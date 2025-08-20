package org.innowise.practice_tasks.stream_api;

public class StringUtils {

    public static String removePunctuation(String str) {
        return str.replaceAll("[^a-zA-Z\\s]", "");
    }

    public static boolean containsDigits(String str) {
        return str.matches(".*\\d.*");
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
