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
            int n = Integer.parseInt(reader.readLine());

            int[] arr = new int[n];
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(tokenizer.nextToken());
            }

            int max = arr[arr.length - 1];
            long sum = 0;
            for (int j = arr.length - 1; j >= 0; j--) {
                if (arr[j] >= max) {
                    max = arr[j];
                } else {
                    sum += (max - arr[j]);
                }
            }

            builder.append("#").append(i).append(" ").append(sum).append("\n");
        }

        System.out.println(builder);
    }
}