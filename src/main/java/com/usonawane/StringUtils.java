package com.usonawane;

public class StringUtils {

    /**
     * Capitalizes the first character of the string.
     * Example: "hello" → "Hello"
     */
    public static String capitalize(String input) {
	System.out.println("input string as :"+input);
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    /**
     * Checks if a string is a palindrome.
     * Ignores case and non-alphanumeric characters.
     * Example: "A man, a plan, a canal, Panama" → true
     * Sample
     */
    public static boolean isPalindrome(String input) {
	System.out.println("input string as :"+input);
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
