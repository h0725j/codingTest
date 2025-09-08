import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashSet<String> users = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String command = reader.readLine();

            if (command.equals("ENTER")) {
                cnt += users.size();
                users.clear();
            } else {
                users.add(command);
            }
        }

        cnt += users.size();
        System.out.println(cnt);
    }
}