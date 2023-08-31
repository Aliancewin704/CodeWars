package org.example.five_kyu.NumberOfTrailingZerosOfN;

public class NumberOfTrailingZerosOfN {

    public static int zeros(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }
}
