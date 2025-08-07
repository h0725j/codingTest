import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(reader.readLine());

        System.out.println(((n-2) * (n-1) * n) / 6);
        System.out.println(3);
    }
}