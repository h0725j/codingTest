import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int lastValue = 0;

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String command = input[0];

            switch (command) {
                case "push":
                    int num = Integer.parseInt(input[1]);
                    queue.offer(num);
                    lastValue = num;
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(queue.poll()).append("\n");
                    }
                    break;

                case "size":
                    result.append(queue.size()).append("\n");
                    break;

                case "empty":
                    if (queue.isEmpty()) {
                        result.append(1).append("\n");
                    } else {
                        result.append(0).append("\n");
                    }
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(queue.peek()).append("\n");
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        result.append(-1).append("\n");
                    } else {
                        result.append(lastValue).append("\n");
                    }
                    break;
            }
        }
        System.out.println(result);
    }
}