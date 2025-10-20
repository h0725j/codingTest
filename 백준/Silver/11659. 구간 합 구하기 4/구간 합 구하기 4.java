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

        int[] prefix = new int[n + 1];
        tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(tokenizer.nextToken());
            prefix[i] = prefix[i - 1] + value;
        }

        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            int sum = prefix[b] - prefix[a - 1];
            builder.append(sum).append("\n");
        }

        System.out.println(builder);
    }
}