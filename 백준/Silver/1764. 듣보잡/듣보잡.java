import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        HashSet<String> hearSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hearSet.add(reader.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = reader.readLine();
            if (hearSet.contains(name)) {
                result.add(name);
            }
        }

        Collections.sort(result);

        StringBuilder builder = new StringBuilder();
        builder.append(result.size()).append("\n");
        for (String name : result) {
            builder.append(name).append("\n");
        }

        System.out.println(builder);
    }
}