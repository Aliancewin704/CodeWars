package org.example.four_kyu.TwiceLinear;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwiceLinear {

    public static int twiceLinear(int n) {
        Set<Integer> set = new HashSet<>();
        int r = 1;
        for(int i = 1; i < n; i++){
            if(set.contains(r) || i == 1){
                set.add(r * 2 + 1);
                set.add(r * 3 + 1);
            } else {
                i--;
            }
            r++;
        }
        set.add(1);
        List<Integer> list =  set.stream().sorted().collect(Collectors.toList());
        return list.get(n);
    }
}