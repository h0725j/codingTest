import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int[] temp = new int[n];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            temp[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += temp[i];
        }

        int max = windowSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - temp[i - k] + temp[i];
            max = Math.max(max, windowSum);
        }

        System.out.println(max);
    }
}