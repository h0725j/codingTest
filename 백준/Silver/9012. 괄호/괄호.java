import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String vps = reader.readLine();
            boolean flag = true;

            for (int j = 0; j < vps.length(); j++) {
                char c = vps.charAt(j);
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (flag && stack.isEmpty()) {
                result.append("YES").append("\n");
            } else {
                result.append("NO").append("\n");
            }
        }
        System.out.println(result);
    }
}