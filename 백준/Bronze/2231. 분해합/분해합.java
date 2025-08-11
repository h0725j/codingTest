import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int answer = 0;

        for (int i = 1; i < n; i++) {
            int sum = i;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            if (sum == n) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}