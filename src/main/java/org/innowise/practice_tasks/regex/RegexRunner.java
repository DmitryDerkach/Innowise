package org.innowise.practice_tasks.regex;

import org.testng.Assert;

public class RegexRunner {

    public static void main(String[] args) {
        testHtmlColorCodeMatcher();
        testNumberWithoutPlusSignMatcher();
        testBalancedBracketsMatcher();
        testTimeInTextMatcher();
        testFractionalNumbersMatcher();
        testTextInQuotesMatcher();
    }
	
    public static void testHtmlColorCodeMatcher() {
        String colorCode1 = "#ABCDEF";
        String colorCode2 = "#12345G";
        String colorCode3 = "#1234567";
        Assert.assertTrue(HtmlColorCodeMatcher.isValidHtmlColorCode(colorCode1), colorCode1 + " should be valid");
        Assert.assertFalse(HtmlColorCodeMatcher.isValidHtmlColorCode(colorCode2), colorCode2 + " should not be valid");
        Assert.assertFalse(HtmlColorCodeMatcher.isValidHtmlColorCode(colorCode3), colorCode3 + " should not be valid");
    }

    public static void testNumberWithoutPlusSignMatcher() {
        String text1 = "2*9-6*5";
        String text2 = "(3+5)-9*4";
        String text3 = "123+456";
        Assert.assertTrue(NumberWithoutPlusSignMatcher.isNumberNotFollowedByPlus(text1), "Numbers in '" + text1 + "' not followed by '+' should be found");
        Assert.assertTrue(NumberWithoutPlusSignMatcher.isNumberNotFollowedByPlus(text2), "Numbers in '" + text2 + "' not followed by '+' should be found");
        Assert.assertTrue(NumberWithoutPlusSignMatcher.isNumberNotFollowedByPlus(text3), "Numbers in '" + text3 + "' not followed by '+' should be found");
    }
    
    public static void testBalancedBracketsMatcher() {
        String expression1 = "(2+3)*(5-1)";
        String expression2 = "(2+3*(5-1)";
        String expression3 = "2+3)*(5-1)";
        Assert.assertTrue(BalancedBracketsMatcher.hasBalancedBrackets(expression1), "Expression '" + expression1 + "' should have balanced brackets");
        Assert.assertFalse(BalancedBracketsMatcher.hasBalancedBrackets(expression2), "Expression '" + expression2 + "' should not have balanced brackets");
        Assert.assertFalse(BalancedBracketsMatcher.hasBalancedBrackets(expression3), "Expression '" + expression3 + "' should not have balanced brackets");
    }

    public static void testTimeInTextMatcher() {
        String time1 = "09:00";
        String time2 = "23:59";
        String time3 = "37:98";
        Assert.assertTrue(TimeInTextMatcher.isValidTime(time1), time1 + " should be valid");
        Assert.assertTrue(TimeInTextMatcher.isValidTime(time2), time2 + " should be valid");
        Assert.assertFalse(TimeInTextMatcher.isValidTime(time3), time3 + " should not be valid");
    }

    public static void testFractionalNumbersMatcher() {
        String fractionalText1 = "3.14";
        String fractionalText2 = "123.456";
        String fractionalText3 = "1,234.56";
        String fractionalText4 = "1 234.56";
        String fractionalText5 = "1234";
        Assert.assertTrue(FractionalNumbersMatcher.hasFractionalNumber(fractionalText1), "Fractional numbers in '" + fractionalText1 + "' should be found");
        Assert.assertTrue(FractionalNumbersMatcher.hasFractionalNumber(fractionalText2), "Fractional numbers in '" + fractionalText2 + "' should be found");
        Assert.assertFalse(FractionalNumbersMatcher.hasFractionalNumber(fractionalText5), "Fractional numbers in '" + fractionalText5 + "' should not be found");
    }

    public static void testTextInQuotesMatcher() {
        String quoteText1 = "The word \"hello\" is in quotes.";
        String quoteText2 = "This text has no quotes.";
        String quoteText3 = "\"First quote\" and \"second quote\".";
        Assert.assertTrue(TextInQuotesMatcher.hasTextInQuotes(quoteText1), "Text in quotes in '" + quoteText1 + "' should be found");
        Assert.assertFalse(TextInQuotesMatcher.hasTextInQuotes(quoteText2), "Text in quotes in '" + quoteText2 + "' should not be found");
        Assert.assertTrue(TextInQuotesMatcher.hasTextInQuotes(quoteText3), "Text in quotes in '" + quoteText3 + "' should be found");
    }
}
