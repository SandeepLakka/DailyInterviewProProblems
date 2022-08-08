package io.github.sandeeplakka;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerFunctionTest {

    private PowerFunction ut;

    @BeforeEach
    void setUp() {
        ut = new PowerFunction();
    }

    @Test
    void tests_logOfNSolution() {
        assertEquals(125, ut.logOfNSolution(5, 3));
        assertEquals(81, ut.logOfNSolution(3, 4));
    }

    @Test
    void tests_oofNSolution() {
        assertEquals(125, ut.OofNSolution(5, 3));
        assertEquals(81, ut.OofNSolution(3, 4));
    }
}