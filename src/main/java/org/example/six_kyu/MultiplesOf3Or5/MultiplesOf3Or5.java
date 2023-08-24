package org.example.six_kyu.MultiplesOf3Or5;

public class MultiplesOf3Or5 {

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) { sum += i; } else if (i % 5 == 0) sum += i;
        }
        return sum;
    }

}
