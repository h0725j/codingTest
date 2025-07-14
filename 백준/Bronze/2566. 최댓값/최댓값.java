import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] input = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        int max = input[0][0];
        int n = 0;
        int m = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (input[i][j] >= max) {
                    max = input[i][j];
                    n = i + 1;
                    m = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(n + " " + m);
    }
}