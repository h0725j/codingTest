import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String input = reader.readLine();
        char[] s = input.toCharArray();

        int[][] prefix = new int[26][s.length + 1];
        for (int i = 0; i < s.length; i++) {
            int index = s[i] - 'a';

            for (int j = 0; j < 26; j++) {
                prefix[j][i + 1] = prefix[j][i];
            }

            prefix[index][i + 1]++;
        }

        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            char a = tokenizer.nextToken().charAt(0);
            int l = Integer.parseInt(tokenizer.nextToken());
            int r = Integer.parseInt(tokenizer.nextToken());

            int index = a - 'a';
            int cnt = prefix[index][r + 1] - prefix[index][l];
            builder.append(cnt).append("\n");
        }

        System.out.println(builder);
    }
}