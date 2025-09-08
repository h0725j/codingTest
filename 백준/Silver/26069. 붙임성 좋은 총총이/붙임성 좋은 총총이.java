import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashSet<String> dance = new HashSet<>();

        dance.add("ChongChong");

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            
            String a = tokenizer.nextToken();
            String b = tokenizer.nextToken();

            if (dance.contains(a) || dance.contains(b)) {
                dance.add(a);
                dance.add(b);
            }
        }

        System.out.println(dance.size());
    }
}