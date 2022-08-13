package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumberTest {

    private PerfectNumber ut;

    @BeforeEach
    void setUp() {
        ut = new PerfectNumber();
    }

    @Test
    void tests_checkPerfectNumber_for_no_28() {
        assertTrue(ut.checkPerfectNumber(28));
    }

    @Test
    void tests_checkPerfectNumber_with_perfectNumbers() {
        assertTrue(ut.checkPerfectNumber(8128));
        assertTrue(ut.checkPerfectNumber(496));
        assertTrue(ut.checkPerfectNumber(6));
        assertTrue(ut.checkPerfectNumber(33550336));
    }

    @Test
    void tests_checkPerfectNumber_with_non_perfectNumbers() {
        assertFalse(ut.checkPerfectNumber(8080));
        assertFalse(ut.checkPerfectNumber(49));
        assertFalse(ut.checkPerfectNumber(1234));
        assertFalse(ut.checkPerfectNumber(102030));
    }

    @Test
    void tests_checkPerfectNumber_for_nos_0123() {
        assertTrue(ut.checkPerfectNumber(0));
        assertTrue(ut.checkPerfectNumber(1));
        assertFalse(ut.checkPerfectNumber(2));
        assertFalse(ut.checkPerfectNumber(3));
    }
}