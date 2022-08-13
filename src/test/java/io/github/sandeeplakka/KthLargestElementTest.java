package io.github.sandeeplakka;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    private KthLargestElement ut;

    @BeforeEach
    void setUp() {
        ut = new KthLargestElement();
    }

    @Test
    void tests_findKthLargest_for_random_elements(){
        assertEquals(8,
                ut.findKthLargest(Lists.list(3, 5, 2, 4, 6, 8), 1));
        assertEquals(1002,
                ut.findKthLargest(Lists.list(30, 25, 222, 43, 236, 1002,2342), 2));
        assertEquals(1236,
                ut.findKthLargest(Lists.list(331, 23535, 2122, 4123, 1236, 1328), 5));

    }

    @Test
    void tests_findKthLargest_for_all_same_elements() {
        assertEquals(1, ut.findKthLargest(Lists.list(1,1,1,1,1,1),1));
        assertEquals(1, ut.findKthLargest(Lists.list(1,1,1,1,1,1),5));
    }
}