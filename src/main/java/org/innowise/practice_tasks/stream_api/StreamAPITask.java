package org.innowise.practice_tasks.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITask {
	/*
	Task
	Write a Java program that processes an array of sentences according to the following rules:
	• Remove all punctuation marks from each sentence.
	• Split each sentence into words.
	• Remove all words that contain digits.
	• Capitalize each remaining word (first letter uppercase, the rest lowercase).
	• Print the resulting list of words for each sentence.

	Requirements:
	Use the Stream API for transformations (map, filter, collect).
	Create a StringUtils utility class with methods for text processing (all necessary methods).
	result example - [I, Have, And, Fish, At, Home]
	 */

    // Array of sentences to be processed
    static String[] sentences = {
            "The quick brown fox jumps over the lazy dog.",
            "Java is a versatile programming language!",
            "Arrays are a collection of elements.",
            "The temperature today is -5 degrees Celsius.",
            "I have 2 cats, 1 dog, and 5 fish at home.",
            "Can you solve100% this: 10 + 20 = ?",
            "Room 101 is located on the 2nd floor.",
            "42 is the answer to life, the universe, and everything.",
            "The price is $99.99 for one item.",
            "Did you know? 7 out of 10 people enjoy programming."
    };

    public static void main(String[] args) {
        for (String sentence : sentences) {
            List<String> words = Arrays.stream(sentence.split("\\s+"))
                    .map(StringUtils::removePunctuation)
                    .filter(word -> !word.isEmpty()) // Добавлено: фильтрация пустых строк
                    .filter(word -> !StringUtils.containsDigits(word))
                    .map(StringUtils::capitalize)
                    .collect(Collectors.toList());
            System.out.println(words);
        }
    }
}