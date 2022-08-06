package io.github.sandeeplakka;

/**
 * This problem was recently asked by Apple:
 * <p>
 * Given a non-negative integer n, convert n to base 2 in string form.
 * Do not use any built in base 2 conversion functions like bin.
 * <p>
 * Here's an example and some starter code:
 * <pre>
 * def base_2(n):
 *   # Fill this in.
 *
 * print(base_2(123))
 * # 1111011
 *
 *
 * In the above example, 2^6 + 2^5 + 2^4 + 2^3 + 2^1 + 2^0 = 123.
 * </pre>
 */
public class Base2Converter {

    public String convertToBase2(int number) {
        if (number == 0) return String.valueOf(0);
        StringBuilder builder = new StringBuilder();
        while (number > 0) {
            builder.append(number % 2);
            number /= 2;
        }
        return builder.reverse().toString();
    }

}
