package org.example.six_kyu.SumsOfParts;

public class SumsOfParts {
    public static int[] sumParts(int[] ls) {
        int[] ans = new int[ls.length + 1];
        int sum = 0;
        for (int i = ls.length - 1; i >= 0; i--) {
            sum += ls[i];
            ans[i] = sum;
        }
        ans[ans.length - 1] = 0;
        return ans;
    }
}
