// https://www.geeksforgeeks.org/problems/multiply-two-strings/1
package dsa.preparation.string.geeksforgeeks;

import java.math.BigInteger;

public class MultiplyTwoString {
    public String multiplyStrings(String s1, String s2) {
        // code here.
        BigInteger first = new BigInteger(s1);
        BigInteger second = new BigInteger(s2);
        return String.valueOf(first.multiply(second));
    }
}
