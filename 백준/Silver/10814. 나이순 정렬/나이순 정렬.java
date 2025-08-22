import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String[][] list = new String[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            list[i][0] = tokenizer.nextToken();
            list[i][1] = tokenizer.nextToken();
        }

        Arrays.sort(list, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(list[i][0]).append(" ").append(list[i][1]).append("\n");
        }
        System.out.println(builder);
    }
}