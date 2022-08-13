package io.github.sandeeplakka;

import java.util.HashSet;
import java.util.Set;

/**
 * This problem was recently asked by Facebook:
 * <p>
 * A Perfect Number is a positive integer that is equal to the
 * sum of all its positive divisors except itself.
 * <p>
 * For instance,
 * <br>
 * 28 = 1 + 2 + 4 + 7 + 14
 * <br>
 * Write a function to determine if a number is a perfect number.
 */
public class PerfectNumber {

    public boolean checkPerfectNumber(int number) {
        return this.getDivisors(number)
                .stream()
                .mapToInt(Integer::intValue)
                .sum() == number;
    }

    private Set<Integer> getDivisors(int number) {
        Set<Integer> result = new HashSet<>();
        if (number == 0) return result;
        result.add(1);
        if(number == 1) return result;
        int val = 2;
        while (val < number) {
            if (number % val == 0) {
                result.add(val);
            }
            val++;
        }
        return result;
    }
}
