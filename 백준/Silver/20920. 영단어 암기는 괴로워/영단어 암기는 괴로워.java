import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = reader.readLine();
            if (word.length() >= m) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (a, b) -> {
            int A = map.get(a);
            int B = map.get(b);

            if (A != B) return B - A; // 빈도순
            if (a.length() != b.length()) return b.length() - a.length(); // 길이순
            return a.compareTo(b); // 사전순
        });

        for (String word : words) {
            writer.write(word + "\n");
        }

        writer.flush();
        writer.close();
    }
}