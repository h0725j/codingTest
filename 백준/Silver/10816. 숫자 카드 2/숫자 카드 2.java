import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> cards = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(tokenizer.nextToken());
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int m = Integer.parseInt(reader.readLine());
        tokenizer = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(tokenizer.nextToken());
            result.append(cards.getOrDefault(num, 0)).append(" ");
        }

        System.out.println(result);
    }
}