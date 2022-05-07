package io.github.sandeeplakka;

import io.github.sandeeplakka.LevelOfTreeWithMaxSum.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelOfTreeWithMaxSumTest {

    private LevelOfTreeWithMaxSum underTest;

    @BeforeEach
    void setUp() {
        underTest = new LevelOfTreeWithMaxSum();
    }

    @Test
    void test_treeLevelMaxSum_case1() {
        assertEquals(-1, underTest.treeLevelMaxSum(null));
    }


    @Test
    void test_treeLevelMaxSum_case2() {
        Node n3 = new Node(4, new Node(3), new Node(2));
        Node n2 = new Node(5, new Node(4), new Node(-1));
        Node n1 = new Node(1, n2, n3);
        assertEquals(1, underTest.treeLevelMaxSum(n1));
    }

    @Test
    void test_treeLevelMaxSum_case3() {
        Node n3 = new Node(4, new Node(3), null);
        Node n2 = new Node(6, null, new Node(10));
        Node n1 = new Node(1, n2, n3);
        assertEquals(2, underTest.treeLevelMaxSum(n1));
    }



}
