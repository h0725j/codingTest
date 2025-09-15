import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], ' ');
        }

        star(0, 0, n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(matrix[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void star(int y, int x, int size) {
        if (size == 1) {
            matrix[y][x] = '*';
            return;
        }

        int newSize = size / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }

                int newY = y + i * newSize;
                int newX = x + j * newSize;

                star(newY, newX, newSize);
            }
        }
    }
}