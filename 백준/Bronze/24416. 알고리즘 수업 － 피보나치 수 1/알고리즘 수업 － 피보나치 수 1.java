import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int fibCnt = 0;
    static int fibonacciCnt = 0;

    static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCnt++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static int fibonacci(int n) {
        int[] f = new int [n + 1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            fibonacciCnt++;
        }
        return f[n];
    }

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(reader.readLine());

       fib(n);
       fibonacci(n);

       System.out.println(fibCnt + " " + fibonacciCnt);
    }
}