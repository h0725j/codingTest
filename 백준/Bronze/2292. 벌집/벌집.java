import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            num = num + (6 * i);
            if ( n <= num) {
                result = i + 1;
                break;
            }
        }

        System.out.println(result);
    }
}