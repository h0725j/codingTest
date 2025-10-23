import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char[] s = input.toCharArray();

        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            char a = tokenizer.nextToken().charAt(0);
            int l = Integer.parseInt(tokenizer.nextToken());
            int r = Integer.parseInt(tokenizer.nextToken());

            int cnt = 0;
            for (int j = l; j <= r; j++) {
                if (a == s[j]) {
                   cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}