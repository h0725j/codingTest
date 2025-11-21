import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 0; tc < 10; tc++) {
            int t = Integer.parseInt(reader.readLine());
            String find = reader.readLine();
            String string = reader.readLine();

            int cnt = 0;
            for (int i = 0; i <= string.length() - find.length(); i++) {
                String part = string.substring(i, i + find.length());

                if (part.equals(find)) {
                    cnt++;
                }
            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}