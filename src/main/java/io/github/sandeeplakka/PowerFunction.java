package io.github.sandeeplakka;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * This problem was recently asked by AirBNB:
 * <p>
 * The power function calculates x raised to the nth power.
 * If implemented in O(n) it would simply be a for loop over n and multiply x n times.
 * Instead implement this power function in O(log n) time.
 * You can assume that n will be a non-negative integer.
 * <p>
 * Here's some starting code:
 *
 * <pre>
 * def pow(x, n):
 *   # Fill this in.
 *
 * print(pow(5, 3))
 * # 125
 * </pre>
 */
public class PowerFunction {

    public static void main(String[] args) {
        PowerFunction ut = new PowerFunction();
        System.out.println(ut.OofNSolution(5, 3));
        System.out.println(ut.logOfNSolution(5, 3));
    }

    //TODO: problem statement required solution
    public int logOfNSolution(int x, int n) {
        throw new AbstractMethodError("not yet implemented");
    }

    //bruteforce solution
    public int OofNSolution(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }


}
