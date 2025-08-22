import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] num = new int[n];
        int[] sorted = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = sorted[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        for (int k : sorted) {
            if (!rankMap.containsKey(k)) {
                rankMap.put(k, rank++);
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int j : num) {
            builder.append(rankMap.get(j)).append(" ");
        }

        System.out.println(builder);
    }
}