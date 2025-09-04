import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 1; i <= n; i++) {
            int paper = Integer.parseInt(tokenizer.nextToken());
            map.put(i, paper);
            deque.offer(i);
        }

        while (!deque.isEmpty()) {
            int current = deque.pollFirst();
            builder.append(current).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            int move = map.get(current);

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(builder);
    }
}