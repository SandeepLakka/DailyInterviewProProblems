package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsFinderTest {

    private AnagramsFinder anagramsFinder;

    @BeforeEach
    void setUp() {
        anagramsFinder = new AnagramsFinder();
    }

    @Test
    void find_anagrams_positive_cases() {
        assertArrayEquals(new int[]{3, 7}, anagramsFinder.find_anagrams("acdbacdacb", "abc"));
        assertArrayEquals(new int[]{0, 4, 7}, anagramsFinder.find_anagrams("acdbacdacb", "ac"));
        assertArrayEquals(new int[]{0, 6}, anagramsFinder.find_anagrams("cbaebabacd", "abc"));
        assertArrayEquals(new int[]{0, 1, 2}, anagramsFinder.find_anagrams("abab", "ab"));
    }

    @Test
    void find_anagrams_negative_cases() {
        assertNull(anagramsFinder.find_anagrams(null, "a"));
        assertNull(anagramsFinder.find_anagrams("abcdeabbcb", null));
        assertNull(anagramsFinder.find_anagrams(null, null));
        assertNull(anagramsFinder.find_anagrams("hello", "hello_there"));
    }
}