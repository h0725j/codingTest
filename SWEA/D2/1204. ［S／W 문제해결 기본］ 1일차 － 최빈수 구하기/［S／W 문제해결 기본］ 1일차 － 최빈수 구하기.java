import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int t = Integer.parseInt(reader.readLine());

        for (int tc = 1; tc <= t; tc++) {
            int tcNum = Integer.parseInt(reader.readLine());
            int[] nums = new int[101];

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            while (tokenizer.hasMoreTokens()) {
                int num = Integer.parseInt(tokenizer.nextToken());
                nums[num]++;
            }

            int max = Integer.MIN_VALUE;
            int result = 0;

            for (int i = 0 ; i < 101; i++) {
                if (nums[i] > max || (nums[i] == max && i > result)) {
                    max = nums[i];
                    result = i;
                }
            }

            builder.append("#").append(tcNum).append(" ").append(result).append("\n");
        }

        System.out.println(builder);
    }
}