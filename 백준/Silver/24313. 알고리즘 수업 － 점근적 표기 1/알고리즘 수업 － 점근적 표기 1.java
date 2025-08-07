import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int a1 = Integer.parseInt(tokenizer.nextToken());
        int a0 = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(reader.readLine());
        int n0 = Integer.parseInt(reader.readLine());
        boolean result = true;

        for (int i = n0; i <= 100; i++) {
            if (!(a1 * i + a0 <= c * i)) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}