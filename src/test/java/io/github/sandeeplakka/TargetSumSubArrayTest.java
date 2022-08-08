package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumSubArrayTest {

    private TargetSumSubArray ut;

    @BeforeEach
    void setUp() {
        ut = new TargetSumSubArray();
    }

    @Test
    void tests_findSubArray() {
        assertArrayEquals(new int[]{2, 5, 7}, Arrays.stream(
                ut.findSubArray(new int[]{1, 3, 2, 5, 7, 2}, 14))
                .sorted()
                .toArray()
        );

        assertArrayEquals(new int[]{3, 10, 20}, Arrays.stream(
                ut.findSubArray(new int[]{1, 4, 20, 3, 10, 5}, 33))
                .sorted()
                .toArray()
        );
    }
}