package com.usonawane;

public class StringUtils {

    /**
     * Capitalizes the first character of the string.
     * Example: "hello" → "Hello"
     */
	public static String capitalize(String input) {
    System.out.println("Hello Program starts---");
    System.out.println("input string as ----:" + input)

    if (input == null || input.isEmpty()) {
        return input;
    }

    String upper = input.toUpperCase();
    return upper;
}


	public static String nitinFunction(String input) {
        System.out.println("Program is start: ");
		System.out.println("Input string: " + input);

        if (input == null || input.isEmpty()) return input;

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                result.append(ch);
                capitalizeNext = true;
            } else if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
                capitalizeNext = false;
            }
        }

        return result.toString();
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



