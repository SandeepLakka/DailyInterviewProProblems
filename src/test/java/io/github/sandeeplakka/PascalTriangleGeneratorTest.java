package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleGeneratorTest {

    private PascalTriangleGenerator ut;

    @BeforeEach
    void setUp() {
        ut = new PascalTriangleGenerator();
    }

    @Test
    void tests_normal_getPascalTriangleRow() {
        assertArrayEquals(new int[]{1, 5, 10, 10, 5, 1}, ut.getPascalTriangleRow(6));
        assertArrayEquals(new int[]{1, 6, 15, 20, 15, 6, 1}, ut.getPascalTriangleRow(7));
        assertArrayEquals(new int[]{1, 3, 3, 1}, ut.getPascalTriangleRow(4));
    }

    @Test
    void tests_edge_getPascalTriangleRow() {
        assertArrayEquals(new int[]{1}, ut.getPascalTriangleRow(1));
        assertArrayEquals(new int[]{}, ut.getPascalTriangleRow(0));
        assertArrayEquals(new int[]{1, 1}, ut.getPascalTriangleRow(2));
    }
}