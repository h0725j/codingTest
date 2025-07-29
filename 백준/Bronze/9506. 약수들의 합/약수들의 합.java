import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       while (true) {
           StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
           int N = Integer.parseInt(tokenizer.nextToken());
           if (N == -1) break;

           List<String> list = new ArrayList<>();
           int sum = 0;
           for (int i = 1; i < N; i++) {
               if (N % i == 0) {
                   list.add(String.valueOf(i));
                   sum += i;
               }
           }

           if (sum == N) {
               System.out.print(N+" = ");
               for (String s : list) {
                   if (s.equals(list.get(list.size() - 1))) {
                       System.out.print(s);
                   } else {
                       System.out.print(s + " + ");
                   }
               }
               System.out.println(" ");
           } else {
               System.out.println(N+" is NOT perfect.");
           }
       }
    }
}