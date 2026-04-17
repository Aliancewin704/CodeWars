package org.example.six_kyu.FindTheOddInt;

public class FindTheOddInt {

    public static int findIt(int[] a) {
        int result = 0;
        for (int i : a) {
            result ^= i;
        }
        return result;
    }
}
