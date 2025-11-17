import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int t = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            System.out.println("#" + t + " " + math(n, m));
        }
    }

    static int math(int n, int m) {
        if (m == 0) return 1;
        if (m == 1) return n;
        
        int half = math(n, m / 2);
        
        if (m % 2 == 0) {
            return half * half;
        } else {
            return half * half * n;
        }
    }
}