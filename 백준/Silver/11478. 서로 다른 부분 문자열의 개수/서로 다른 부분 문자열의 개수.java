import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < n.length(); i++) {
            for (int j = i + 1; j <= n.length(); j++) {
                set.add(n.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}