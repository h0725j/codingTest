import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            words.add(reader.readLine());
        }

        words.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });

        StringBuilder builder = new StringBuilder();
        String prev = " ";

        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).equals(prev)) {
                builder.append(words.get(i)).append('\n');
                prev = words.get(i);
            }
        }

        System.out.println(builder);
    }
}