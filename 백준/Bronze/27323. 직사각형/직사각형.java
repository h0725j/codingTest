import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());

        System.out.println(A*B);
    }
}