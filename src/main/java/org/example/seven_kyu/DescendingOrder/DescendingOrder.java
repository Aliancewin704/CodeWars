package org.example.seven_kyu.DescendingOrder;


import java.util.Arrays;
import java.util.Collections;


public class DescendingOrder {

    public static int sortDesc(int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }
}
