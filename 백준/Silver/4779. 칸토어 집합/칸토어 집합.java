import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null) {
            int n = Integer.parseInt(line);

            char[] arr = new char[(int) Math.pow(3, n)];

            Arrays.fill(arr, '-');

            cantor(arr, 0, arr.length);
            System.out.println(arr);
        }
    }

    public static void cantor(char[] arr, int start, int length) {
        if (length == 1) {
            return;
        }

        int segment = length / 3;

        for (int i = start + segment; i < start + 2 * segment; i++) {
            arr[i] = ' ';
        }

        cantor(arr, start, segment);
        cantor(arr, start + 2 * segment, segment);
    }
}