package io.github.sandeeplakka;

/**
 * This problem was recently asked by Twitter:
 * <p>
 * Given an integer, check if that integer is a palindrome.
 * For this problem do not convert the integer to a string to check if it is a palindrome.
 *
 * <pre>
 * import math
 *
 * def is_palindrome(n):
 *   # Fill this in.
 *
 * print is_palindrome(1234321)
 * # True
 * print is_palindrome(1234322)
 * # False
 * </pre>
 */
public class NumberPalindromeChecker {

    public static void main(String[] args) {
        NumberPalindromeChecker ut = new NumberPalindromeChecker();
        ut.isPalindrome(123454321);
    }

    public boolean isPalindrome(int number) {
        int len = 0;
        int num = number;
        while (num != 0) {
            len++;
            num /= 10;
        }
        for (int i = 0; i < len / 2; i++) {
            int init = (int) (number / Math.pow(10, i)) % 10;
            int last = (int) (number / Math.pow(10, len - i - 1) % 10);
            if (init != last) return false;
        }
        return true;
    }
}
