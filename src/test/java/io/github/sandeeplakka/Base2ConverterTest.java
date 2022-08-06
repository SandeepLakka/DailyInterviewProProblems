package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Base2ConverterTest {

    private Base2Converter ut;

    @BeforeEach
    void setUp() {
        ut = new Base2Converter();
    }

    @Test
    void tests_convertToBase2_for_perfect_binary_numbers() {
        assertEquals("0", ut.convertToBase2(0));
        assertEquals("10", ut.convertToBase2(2));
        assertEquals("100", ut.convertToBase2(4));
        assertEquals("1000", ut.convertToBase2(8));
        assertEquals("10000000", ut.convertToBase2(128));
    }

    @Test
    void tests_convertToBase2_for_all_1s_numbers() {
        assertEquals("1", ut.convertToBase2(1));
        assertEquals("11", ut.convertToBase2(3));
        assertEquals("111", ut.convertToBase2(7));
        assertEquals("1111", ut.convertToBase2(15));
        assertEquals("11111111", ut.convertToBase2(255));
    }


    @Test
    void tests_convertToBase2_for_mix_of_1s_and_0s_numbers() {
        assertEquals("1011", ut.convertToBase2(11));
        assertEquals("101", ut.convertToBase2(5));
        assertEquals("1100", ut.convertToBase2(12));
        assertEquals("11110", ut.convertToBase2(30));
        assertEquals("1101100110110", ut.convertToBase2(6966));
    }


}