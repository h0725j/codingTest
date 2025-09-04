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
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int command = Integer.parseInt(tokenizer.nextToken());

            switch (command) {
                case 1:
                    int a = Integer.parseInt(tokenizer.nextToken());
                    deque.offerFirst(a);
                    break;

                case 2:
                    int b = Integer.parseInt(tokenizer.nextToken());
                    deque.offerLast(b);
                    break;

                case 3:
                    if (!deque.isEmpty()) {
                        builder.append(deque.pollFirst()).append('\n');
                    } else {
                        builder.append(-1).append('\n');
                    }
                    break;

                case 4:
                    if (!deque.isEmpty()) {
                        builder.append(deque.pollLast()).append('\n');
                    } else {
                        builder.append(-1).append('\n');
                    }
                    break;

                case 5:
                    builder.append(deque.size()).append('\n');
                    break;

                case 6:
                    if (deque.isEmpty()) {
                        builder.append(1).append('\n');
                    } else {
                        builder.append(0).append('\n');
                    }
                    break;

                case 7:
                    if (!deque.isEmpty()) {
                        builder.append(deque.peekFirst()).append('\n');
                    } else {
                        builder.append(-1).append('\n');
                    }
                    break;

                case 8:
                    if (!deque.isEmpty()) {
                        builder.append(deque.peekLast()).append('\n');
                    } else {
                        builder.append(-1).append('\n');
                    }
                    break;
            }
        }

        System.out.println(builder);
    }
}