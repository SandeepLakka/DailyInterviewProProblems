package io.github.sandeeplakka;

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

    //logarithmic time complexity wrt to n
    public int logOfNSolution(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        return logOfNSolution(x, n / 2) * logOfNSolution(x, n - n / 2);
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
