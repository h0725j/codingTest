import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashSet<String> nList = new HashSet<>();

        for (int i = 0; i < n; i++) {
            nList.add(reader.readLine());
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            String target = reader.readLine();
            if (nList.contains(target)) {
                count++;
            }
        }

        System.out.println(count);
    }
}