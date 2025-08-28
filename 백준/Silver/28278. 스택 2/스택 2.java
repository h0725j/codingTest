import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            if (tokenizer.countTokens() == 1) {
                int input = Integer.parseInt(tokenizer.nextToken());
                if (input == 2) {
                    if (!stack.isEmpty()) {
                        result.append(stack.pop()).append('\n');
                    } else {
                        result.append(-1).append('\n');
                    }
                } else if (input == 3) {
                    result.append(stack.size()).append('\n');
                } else if (input == 4) {
                    if (stack.isEmpty()) {
                        result.append(1).append('\n');
                    } else {
                        result.append(0).append('\n');
                    }
                } else {
                    if (!stack.isEmpty()) {
                        result.append(stack.peek()).append('\n');
                    } else {
                        result.append(-1).append('\n');
                    }
                }
            } else {
                int input = Integer.parseInt(tokenizer.nextToken());
                int num = Integer.parseInt(tokenizer.nextToken());
                if (input == 1) {
                    stack.push(num);
                }
            }
        }

        System.out.println(result);
    }
}