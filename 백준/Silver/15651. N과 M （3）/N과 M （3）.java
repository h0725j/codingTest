import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] arr;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());

        arr = new int[m];

        backtrack(0);

        System.out.println(result);
    }

    public static void backtrack(int depth) {
        if (depth == m) {
            for (int j : arr) {
                result.append(j).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[depth] = i;

            backtrack(depth + 1);
        }
    }
}