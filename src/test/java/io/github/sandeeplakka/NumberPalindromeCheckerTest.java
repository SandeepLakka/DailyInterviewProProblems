package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeCheckerTest {

    private NumberPalindromeChecker underTest;

    @BeforeEach
    void setUp() {
        underTest = new NumberPalindromeChecker();
    }

    @Test
    public void positiveTests(){
        assertTrue(underTest.isPalindrome(123321));
        assertTrue(underTest.isPalindrome(1234321));
        assertTrue(underTest.isPalindrome(1));
    }

    @Test
    public void negativeTest(){
        assertFalse(underTest.isPalindrome(102));
        assertFalse(underTest.isPalindrome(1234));
        assertFalse(underTest.isPalindrome(10));
    }


}