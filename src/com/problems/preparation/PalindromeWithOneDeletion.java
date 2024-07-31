package com.problems.preparation;

public class PalindromeWithOneDeletion {
    public static void main(String[] args) {
        String str1 = "aabaa";
        String str2 = "aabcaa";
        String str3 = "aabcdeaa";

        System.out.println(isPalindromeWithOneDeletion(str1)); // Output: true
        System.out.println(isPalindromeWithOneDeletion(str2)); // Output: true
        System.out.println(isPalindromeWithOneDeletion(str3)); // false
    }

    public static boolean isPalindromeWithOneDeletion(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!isPalindrome(str, left, right)) {
                if (isPalindrome(str, left + 1, right)) {
                    return true;
                }
                if (isPalindrome(str, left, right - 1)) {
                    return true;
                }
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
