package org.example.seven_kyu.JadenCasingStrings;

public class JadenCasingStrings {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;
        phrase = String.valueOf(phrase.charAt(0)).toUpperCase() + phrase.substring(1);
        for (int i = 1; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                phrase = phrase.substring(0, i + 1) + String.valueOf(phrase.charAt(i + 1)).toUpperCase() + phrase.substring(i + 2);
            }
        }
        return phrase;
    }
}
