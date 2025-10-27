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

        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(reader.readLine());
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= coin[i]) {
                cnt += k / coin[i];
                k %= coin[i];
            }
        }

        System.out.println(cnt);
    }
}