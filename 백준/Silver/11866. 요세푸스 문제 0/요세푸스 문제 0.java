import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder builder = new StringBuilder();

        builder.append("<");

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while (!deque.isEmpty()) {
            for (int i = 1; i < k; i++) {
                deque.offer(deque.poll());
            }
            
            if (deque.size() == 1) {
                builder.append(deque.poll());
            } else {
                builder.append(deque.poll()).append(", ");
            }
        }

        builder.append(">");
        System.out.println(builder);
    }
}