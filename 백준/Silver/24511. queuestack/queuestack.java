import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        int[] a = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == 0) {
                queue.add(b[i]);
            }
        }

        int m = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            int c = Integer.parseInt(tokenizer.nextToken());
            queue.add(c);

            builder.append(queue.pop()).append(" ");
        }

        System.out.println(builder);
    }
}