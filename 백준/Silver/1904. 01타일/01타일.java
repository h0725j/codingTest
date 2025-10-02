import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int a = 1, b = 2;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            int current = 0;
            for (int i = 3; i <= n; i++) {
                current = (a + b) % 15746;
                a = b;
                b = current;
            }
            System.out.println(current);
        }
    }
}