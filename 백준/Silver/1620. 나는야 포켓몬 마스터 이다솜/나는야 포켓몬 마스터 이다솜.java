import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        HashMap<Integer, String> nName = new HashMap<>();
        HashMap<String, Integer> nNum = new HashMap<>();


        for (int i = 1; i <= n; i++) {
            String name = reader.readLine();
            nName.put(i, name);
            nNum.put(name, i);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String question = reader.readLine();

            try {
                int num = Integer.parseInt(question);
                result.append(nName.get(num)).append('\n');
            } catch (NumberFormatException e) {
                result.append(nNum.get(question)).append('\n');
            }
        }

        System.out.println(result);
    }
}