import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        // 길이가 i이고 마지막 숫자가 j인 계단수의 개수
        int[][] dp = new int[n + 1][10]; // dp[n]까지 사용하기 위해 n+1 크기로 생성

        // 길이가 1인 계단수 초기값 설정
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1; // 1~9가 하나씩의 계단수를 만듬
        }
        dp[1][0] = 0; // 0으로 시작하는 수는 계단수가 아님

        // 현재 마지막 숫자가 j라면 이전 길이(i-1)에서 어떤 숫자가 올 수 있을지 계산
        for (int i = 2; i <= n; i++) { // i = 현재 계산하려는 길이
            for (int j = 0; j <= 9; j++) { // j = 현재 길이에서 마지막 숫자
                if (j == 0) { // 마지막 숫자가 0이면 이전 수는 무조건 1
                    dp[i][j] = dp[i - 1][1] % 1000000000;
                } else if (j == 9) { // 마지막 숫자가 9라면 이전 수는 무조건 8
                    dp[i][j] = dp[i - 1][8] % 1000000000;
                } else { // 마지막이 j라면 이전은 j-1 또는 j+1
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        long sum = 0;

        // 길이가 n이고 마지막 숫자가 0~9인 모든 경우의 합
        for (int i = 0; i < 10; i++) {
            sum = (sum + dp[n][i]) % 1000000000;
        }

        System.out.println(sum);
    }
}