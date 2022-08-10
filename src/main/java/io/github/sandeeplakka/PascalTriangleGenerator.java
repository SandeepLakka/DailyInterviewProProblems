package io.github.sandeeplakka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * This problem was recently asked by AirBNB:
 * <p>
 * Pascal's Triangle is a triangle where all numbers are the sum of the two numbers above it.
 * Here's an example of the Pascal's Triangle of size 5.
 * <pre>
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 * </pre>
 * Given an integer n, generate the n-th row of the Pascal's Triangle.
 */
public class PascalTriangleGenerator {

    public static void main(String[] args) {
        PascalTriangleGenerator ut = new PascalTriangleGenerator();
        //[1, 5, 10, 10, 5, 1]
        //System.out.println(Arrays.toString(ut.getPascalTriangleRow(6)));
    }


    //Increased space to reduce time
    public int[] getPascalTriangleRow(int row) {
        int[][] values = new int[row][row];
        for (int[] arr : values) {
            Arrays.fill(arr, -1);
        }
        int n = row - 1;
        return IntStream.rangeClosed(0, n).map(x -> {
            if (values[n][x] != -1) return values[n][x];
            if (values[n][n - x] != -1) return values[n][n - x];
            return values[n][x] = getNcX(n, x);
        }).toArray();
    }

    private int getNcX(int n, int x) {
        int nominator = IntStream.rangeClosed(n - x + 1, n).reduce(1, (left, right) -> left * right);
        int denominator = IntStream.rangeClosed(1, x).reduce(1, (left, right) -> left * right);
        return nominator / denominator;
    }
}
