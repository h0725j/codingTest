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

        backtrack(1, 0);
        System.out.println(result);
    }

    public static void backtrack(int start, int depth) {
        if (depth == m) {
            for (int j : arr) {
                result.append(j).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            arr[depth] = i;

            backtrack(i + 1, depth + 1);
        }
    }
}