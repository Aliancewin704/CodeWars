package org.example.six_kyu.MexicanWave;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        List<String> ls = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            String symbol = String.valueOf(str.charAt(i)).toUpperCase();
            if (symbol.equals(" ")) continue;
            ls.add(str.substring(0, i) + symbol + str.substring(i + 1));
            counter++;
        }

        return ls.toArray(new String[counter]);
    }
}
