import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[][] xy = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            xy[i][0] = Integer.parseInt(tokenizer.nextToken());
            xy[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(xy, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < xy.length; i++) {
           builder.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        }
        System.out.print(builder);
    }
}