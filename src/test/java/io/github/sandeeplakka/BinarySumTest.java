package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySumTest {

    private BinarySum ut;

    @BeforeEach
    void setUp() {
        ut = new BinarySum();
    }

    @Test
    void tests_binarySum_same_numbers() {
        String bin1,bin2, expected;

        bin1 = bin2 = "1100";
        expected = "11000";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = bin2 = "1010";
        expected = "10100";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = bin2 = "1";
        expected = "10";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = bin2 = expected =  "00";
        assertEquals(expected, ut.binarySum(bin1, bin2));
    }

    @Test
    void tests_binarySum_diff_numbers() {
        String bin1, bin2, expected;

        bin1 = "1010";
        bin2 = "10";
        expected = "1100";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = "1010";
        bin2 = "1100";
        expected = "10110";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = "1110";
        bin2 = "10";
        expected = "10000";
        assertEquals(expected, ut.binarySum(bin1, bin2));

        bin1 = "11101";
        bin2 = "1011";
        expected = "101000";
        assertEquals(expected, ut.binarySum(bin1, bin2));

    }

}