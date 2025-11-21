import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 0; tc < 10; tc++) {
            int t = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[100][100];

            for (int i = 0; i < 100; i++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < 100; j++) {
                    matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }

            int max = 0;
            for (int col = 0; col < 100; col++) {
                int rowSum = 0, colSum = 0;
                for (int row = 0; row < 100; row++) {
                    rowSum += matrix[col][row];
                    colSum += matrix[row][col];
                }
                max = Math.max(max, rowSum);
                max = Math.max(max, colSum);
            }

            int dLSum = 0, dRSum = 0;
            for (int i = 0; i < 100; i++) {
                dLSum += matrix[i][i];
                dRSum += matrix[i][99 - i];
            }
            max = Math.max(max, dLSum);
            max = Math.max(max, dRSum);

            System.out.println("#" + t + " " + max);
        }
    }
}