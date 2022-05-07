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
    void find_anagrams() {
        assertArrayEquals(new int[]{3, 7}, anagramsFinder.find_anagrams("acdbacdacb", "abc"));
    }
}