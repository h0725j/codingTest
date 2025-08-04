import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());

        if (a + b <= c) {
            c = a + b - 1;
        } else if (b + c <= a) {
            a = b + c - 1;
        } else if (c + a <= b) {
            b = c + a - 1;
        }

        System.out.println(a + b + c);
    }
}