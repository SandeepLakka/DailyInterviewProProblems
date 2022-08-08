package io.github.sandeeplakka;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * This problem was recently asked by Amazon:
 *
 * You are given an array of integers, and an integer K.
 * Return the subarray which sums to K.
 * You can assume that a solution will always exist.
 *
 * <pre>
 * def find_continuous_k(list, k):
 *   # Fill this in.
 *
 * print find_continuous_k([1, 3, 2, 5, 7, 2], 14)
 * # [2, 5, 7]
 * </pre>
 */
public class TargetSumSubArray {

    public static void main(String[] args) {
        TargetSumSubArray ut = new TargetSumSubArray();
        System.out.println(Arrays.toString(ut.findSubArray(new int[]{1,3,2,5,7,2},14)));
    }
    public int[] findSubArray(int[] input, int k){
        int idx = 0;
        int sum = 0;
        for(int i = 0; i < input.length; i++){
            sum += input[i];
            if(sum == k) break;
            while (sum > k){
                sum -= input[idx];
                idx++;
            }
        }
        return (sum == k) ? IntStream.of(input).limit(input.length).skip(idx).toArray() : null;
    }
}
