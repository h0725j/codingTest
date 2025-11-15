import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(reader.readLine());

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            ArrayList<Integer> password = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                password.add(Integer.parseInt(tokenizer.nextToken()));
            }

            int c = Integer.parseInt(reader.readLine());

            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < c; j++) {
                String command = tokenizer.nextToken();

                if (command.equals("I")) {
                    int x = Integer.parseInt(tokenizer.nextToken());
                    int y = Integer.parseInt(tokenizer.nextToken());

                    for (int k = 0; k < y; k++) {
                        int s = Integer.parseInt(tokenizer.nextToken());
                        password.add(x + k, s);
                    }
                } else if (command.equals("D")) {
                    int x = Integer.parseInt(tokenizer.nextToken());
                    int y = Integer.parseInt(tokenizer.nextToken());

                    for (int k = 0; k < y; k++) {
                        password.remove(x);
                    }
                } else if (command.equals("A")) {
                    int y = Integer.parseInt(tokenizer.nextToken());

                    for (int k = 0; k < y; k++) {
                        int s = Integer.parseInt(tokenizer.nextToken());
                        password.add(s);
                    }
                }
            }

            builder.append("#").append(i);
            for (int j = 0; j < Math.min(10, password.size()); j++) {
                builder.append(" ").append(password.get(j));
            }
            builder.append("\n");
        }
        System.out.println(builder);
    }
}