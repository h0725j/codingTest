import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int current = Integer.parseInt(tokenizer.nextToken());
        int max = current;

        for (int i = 1; i < n; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            current = Math.max(current + num, num);
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}