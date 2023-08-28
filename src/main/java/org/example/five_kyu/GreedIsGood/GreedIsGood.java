package org.example.five_kyu.GreedIsGood;

public class GreedIsGood {

    public static int greedy(int[] dice) {
        int[] combo = new int[6];
        int score = 0;
        for (int i = 0; i < dice.length; i++) {
            combo[dice[i] - 1]++;
        }
        for (int i = 0; i < combo.length; i++) {
            if (combo[i] >= 3) {
                if (i == 0) {
                    score += 1000;
                    combo[i] -= 3;
                    continue;
                }
                if (i == 4){
                    score += 500;
                    combo[i] -= 3;
                    continue;
                }
                score += (i + 1) * 100;
            }
        }
        score += combo[0] * 100 + combo[4] * 50;
        return score;
    }
}
