package com.usonawane;

public class StringUtils {

    // Capitalizes the first letter
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) return input;
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    // Checks if a string is a palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}
