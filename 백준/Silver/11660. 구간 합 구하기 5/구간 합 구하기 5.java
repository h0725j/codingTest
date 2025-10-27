import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer1 = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(tokenizer1.nextToken());
            }
        }

        int[][] prefix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer tokenizer2 = new StringTokenizer(reader.readLine());
            int x1 = Integer.parseInt(tokenizer2.nextToken());
            int y1 = Integer.parseInt(tokenizer2.nextToken());
            int x2 = Integer.parseInt(tokenizer2.nextToken());
            int y2 = Integer.parseInt(tokenizer2.nextToken());

            builder.append(prefix[x2][y2] - prefix[x1 - 1][y2] - prefix[x2][y1 - 1] + prefix[x1 - 1][y1 - 1]).append('\n');
        }

        System.out.println(builder);
    }
}