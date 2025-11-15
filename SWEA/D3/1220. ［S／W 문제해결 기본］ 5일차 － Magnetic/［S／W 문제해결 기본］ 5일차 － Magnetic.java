import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int len = Integer.parseInt(reader.readLine());

            int[][] matrix = new int[len][len];
            for (int i = 0; i < len; i++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < len; j++) {
                    matrix[i][j] = Integer.parseInt(tokenizer.nextToken());
                }
            }

            int cnt = 0;
            for (int col = 0; col < len; col++) {
                int flag = 0;
                for (int row = 0; row < len; row++) {
                    if (matrix[row][col] == 1) {
                        flag = 1;
                    } else if (matrix[row][col] == 2) {
                        if (flag == 1) {
                            cnt++;
                            flag = 0;
                        }
                    }
                }
            }

            builder.append("#").append(tc).append(" ").append(cnt).append("\n");
        }

        System.out.println(builder);
    }
}