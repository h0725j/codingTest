import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        tokenizer = new StringTokenizer(reader.readLine());
        int[] card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(tokenizer.nextToken());
        }
        
        int max = 0, sum;
        for (int i = 0; i < card.length; i++) {
            for (int j = i + 1; j < card.length; j++) {
                for (int k = j + 1; k < card.length; k++) {
                    sum = card[i] + card[j] + card[k];
                    if (sum <= m && max < sum) {
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}