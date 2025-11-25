import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] lengths = new int[n - 1];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n - 1; i++) {
            lengths[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int[] prices = new int[n];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int min = Integer.MAX_VALUE, sum = 0;

        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            sum = sum + (min * lengths[i]);
        }

        System.out.println(sum);
    }
}