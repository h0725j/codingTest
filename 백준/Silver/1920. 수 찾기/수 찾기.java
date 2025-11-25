import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
        int[] nArray = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            nArray[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(nArray);

        int m = Integer.parseInt(reader.readLine());
        int[] mArray = new int[m];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < m; i++) {
            mArray[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for (int i = 0; i < m; i++) {
            int result = Arrays.binarySearch(nArray, mArray[i]);
            if (result >= 0) {
                builder.append(1).append("\n");
            } else {
                builder.append(0).append("\n");
            }
        }

        System.out.println(builder);
    }
}