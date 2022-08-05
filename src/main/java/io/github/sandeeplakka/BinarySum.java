package io.github.sandeeplakka;

/**
 * This problem was recently asked by Facebook:
 * <p>
 * Given two binary numbers represented as strings,
 * return the sum of the two binary numbers as a new binary represented as a string.
 * Do this without converting the whole binary string into an integer.
 * <p>
 * Here's an example and some starter code.
 * <pre>
 * def sum_binary(bin1, bin2):
 *   # Fill this in.
 *
 * print(sum_binary("11101", "1011"))
 * # 101000
 * </pre>
 */
public class BinarySum {

    public String binarySum(String bin1, String bin2) {
        StringBuilder builder = new StringBuilder();
        int len1 = bin1.length() - 1;
        int len2 = bin2.length() - 1;

        int carry = 0;
        while (len1 >= 0 && len2 >= 0) {
            carry = addAndReturnCarry(bin1, bin2, builder, len1, len2, false, false, carry);
            len1--;
            len2--;
        }
        while (len1 >= 0) {
            carry = addAndReturnCarry(bin1, bin2, builder, len1, len2, false, true, carry);
            len1--;
        }
        while (len2 >= 0) {
            carry = addAndReturnCarry(bin1, bin2, builder, len1, len2, true, false, carry);
            len2--;
        }

        if ((len1 == -1 && len2 == -1) && carry != 0) builder.append(carry);
        return builder.reverse().toString();
    }

    /*
        val1    val2    carry   |   val carry
        0       0       0       |   0   0
        0       0       1       |   0   1
        0       1       0       |   0   1
        0       1       1       |   1   0
        1       0       0       |   0   1
        1       0       1       |   1   0
        1       1       0       |   1   0
        1       1       1       |   1   1
     */
    private int addAndReturnCarry(String bin1, String bin2, StringBuilder builder,
                                  int len1, int len2, boolean isOne, boolean isTwo, int carry) {
        int val;
        int val1 = !isOne ? Integer.parseInt("" + bin1.charAt(len1)) : 0;
        int val2 = !isTwo ? Integer.parseInt("" + bin2.charAt(len2)) : 0;
        int sum = val1 + val2 + carry;
        carry = sum > 1 ? 1 : 0;
        val = sum == 1 || sum == 3 ? 1 : 0;
        builder.append(val);
        return carry;
    }

}
