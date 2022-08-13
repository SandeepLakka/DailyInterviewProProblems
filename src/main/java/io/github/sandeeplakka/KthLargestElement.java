package io.github.sandeeplakka;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * This problem was recently asked by Facebook:
 * <p>
 * Given a list, find the k-th largest element in the list.
 * <pre>
 * Input: list = [3, 5, 2, 4, 6, 8], k = 3
 * Output: 5
 * </pre>
 */
public class KthLargestElement {


    public int findKthLargest(List<Integer> nums, int k) {
        if(k > nums.size()) throw new IllegalArgumentException("k should be less than list length");
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(nums);
        IntStream.range(0, k - 1).forEach(value -> queue.poll());
        return queue.peek();
    }

}
