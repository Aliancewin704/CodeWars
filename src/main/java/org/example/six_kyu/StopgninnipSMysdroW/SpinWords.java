package org.example.six_kyu.StopgninnipSMysdroW;

public class SpinWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
            ans.append(words[i]).append(" ");
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
