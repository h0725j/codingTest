import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(reader.readLine());

            int[] arr = new int[n];
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(tokenizer.nextToken());
            }

            int result = 0;
            for (int j = 2; j < n - 2; j++) {
                int leftMax = Math.max(arr[j - 1], arr[j - 2]);
                int rightMax = Math.max(arr[j + 1], arr[j + 2]);
                int max = Math.max(leftMax, rightMax);

                if (arr[j] > max) {
                    result += (arr[j] - max);
                }
            }

            builder.append("#").append(i).append(" ").append(result).append("\n");
        }
        System.out.println(builder);
    }
}