import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int n = Integer.parseInt(reader.readLine());

            ArrayList<Integer> password = new ArrayList<>();
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                password.add(Integer.parseInt(tokenizer.nextToken()));
            }

            int cmdCnt = Integer.parseInt(reader.readLine());

            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < cmdCnt; i++) {
                String command = tokenizer.nextToken();

                if (command.equals("I")) {
                    int x = Integer.parseInt(tokenizer.nextToken());
                    int y = Integer.parseInt(tokenizer.nextToken());

                    for (int j = 0; j < y; j++) {
                        int s = Integer.parseInt(tokenizer.nextToken());
                        password.add(x + j, s);
                    }
                } else if (command.equals("D")) {
                    int x = Integer.parseInt(tokenizer.nextToken());
                    int y = Integer.parseInt(tokenizer.nextToken());

                    for (int j = 0; j < y; j++) {
                        password.remove(x);
                    }
                }
            }

            builder.append("#").append(tc);

            for (int j = 0; j < Math.min(10, password.size()); j++) {
                builder.append(" ").append(password.get(j));
            }

            builder.append("\n");
        }
        System.out.println(builder);
    }
}