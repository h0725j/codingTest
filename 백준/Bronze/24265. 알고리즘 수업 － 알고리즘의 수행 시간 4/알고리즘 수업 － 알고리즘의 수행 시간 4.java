import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(reader.readLine());

        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}