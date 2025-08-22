import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashSet<Integer> nList = new HashSet<>();

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            nList.add(Integer.parseInt(tokenizer.nextToken()));
        }

        int m = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(tokenizer.nextToken());
            builder.append(nList.contains(target) ? 1 : 0).append(" ");
        }
        
        System.out.println(builder);
    }
}