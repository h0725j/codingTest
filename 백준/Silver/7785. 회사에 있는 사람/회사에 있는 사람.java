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

        int n = Integer.parseInt(reader.readLine());
        HashSet<String> company = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            String status = tokenizer.nextToken();

            if (status.equals("enter")) {
                company.add(name);
            } else {
                company.remove(name);
            }
        }

        ArrayList<String> result = new ArrayList<>(company);
        Collections.sort(result, Collections.reverseOrder());
        
        StringBuilder builder = new StringBuilder();
        for (String s : result) {
            builder.append(s).append("\n");
        }

        System.out.println(builder);
    }
}