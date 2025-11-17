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
        int result = n;
        while (m > 1) {
            result *= n;
            m--;
        }
        return result;
    }
}