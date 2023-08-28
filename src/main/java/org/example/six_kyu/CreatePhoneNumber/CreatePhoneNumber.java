package org.example.six_kyu.CreatePhoneNumber;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
            if (i == 2) sb.append(") ");
            if (i == 5) sb.append("-");
        }
        return sb.toString();
    }
}
