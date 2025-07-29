import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

       int N = Integer.parseInt(tokenizer.nextToken());
       int K = Integer.parseInt(tokenizer.nextToken());
       int cnt = 0;

       for (int i = 1; i <= N; i++) {
           if (N % i == 0) {
               cnt++;
               if (cnt == K) {
                   System.out.println(i);
               }
           }
       }

       if (cnt < K) {
           System.out.println(0);
       }
    }
}