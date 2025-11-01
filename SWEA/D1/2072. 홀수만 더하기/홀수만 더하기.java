import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int num = Integer.parseInt(tokenizer.nextToken());

                if (num % 2 != 0) {
                    sum += num;
                }
            }

            builder.append("#").append(i).append(" ").append(sum).append("\n");
        }

        System.out.println(builder);
    }
}