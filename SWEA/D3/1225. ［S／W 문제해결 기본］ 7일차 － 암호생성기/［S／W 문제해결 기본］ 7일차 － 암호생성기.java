import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(reader.readLine());
            LinkedList<Integer> password = new LinkedList<>();

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < 8; i++) {
                password.add(Integer.parseInt(tokenizer.nextToken()));
            }

            boolean finished = false;
            while (!finished) {
                for (int i = 1; i <= 5; i++) {
                    int num = password.removeFirst() - i;
                    if (num <= 0) {
                        password.addLast(0);
                        finished = true;
                        break;
                    } else {
                        password.addLast(num);
                    }
                }
            }

            builder.append("#").append(n);
            for (Integer pw : password) {
                builder.append(" ").append(pw);
            }
            builder.append("\n");
        }
        System.out.println(builder);
    }
}