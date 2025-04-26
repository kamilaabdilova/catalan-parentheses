package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int count  = countWellFormedParenthesis(n);
        System.out.println("Количество правильных скобочных комбинаций для n = " + n + ": " + count);
    }
    public static int countWellFormedParenthesis(int nCouples){
        if (nCouples <= 0) {
            return 0;
        }
        int[] dp = new int[nCouples + 1];
        dp[0] = 1;
        for (int i = 1; i <= nCouples; i++) {
            for (int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[nCouples];
    }
}