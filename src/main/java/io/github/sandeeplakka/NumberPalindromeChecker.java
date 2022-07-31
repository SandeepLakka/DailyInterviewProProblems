package io.github.sandeeplakka;

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
