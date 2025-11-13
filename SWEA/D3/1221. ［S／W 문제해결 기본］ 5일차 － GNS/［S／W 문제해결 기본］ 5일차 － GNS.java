import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        String[] nums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String test = tokenizer.nextToken();
            int len = Integer.parseInt(tokenizer.nextToken());

            int[] count = new int[10];

            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < len; j++) {
                String s = tokenizer.nextToken();

                for (int k = 0; k < 10; k++) {
                    if (s.equals(nums[k])) {
                        count[k]++;
                        break;
                    }
                }
            }

            builder.append(test).append("\n");
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < count[j]; k++) {
                    builder.append(nums[j]).append(" ");
                }
            }
            builder.append("\n");
        }

        System.out.println(builder);
    }
}