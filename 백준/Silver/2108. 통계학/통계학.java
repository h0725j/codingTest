import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
        int[] count = new int[8001];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(reader.readLine());
            num[i] = value;
            sum += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
            count[value + 4000]++;
        }

        builder.append(Math.round((float) sum / n)).append("\n");

        Arrays.sort(num);
        builder.append(num[num.length / 2]).append("\n");

        int maxCnt = 0;
        for (int j : count) {
            maxCnt = Math.max(maxCnt, j);
        }

        int mode = -1;
        int modeFound = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCnt) {
                mode = i - 4000;
                modeFound++;
                if (modeFound == 2) {
                    break;
                }
            }
        }

        builder.append(mode).append("\n");

        builder.append(max - min).append("\n");

        System.out.println(builder);
    }
}