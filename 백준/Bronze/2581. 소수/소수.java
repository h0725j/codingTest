import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int M = Integer.parseInt(reader.readLine());
       int N = Integer.parseInt(reader.readLine());
       int sum = 0;
       List<Integer> list = new ArrayList<>();

       for (int i = M; i <= N; i++) {
           if (i > 1) {
               boolean isPrime = true;

               for (int j = 2; j < i; j++) {
                   if (i % j == 0) {
                       isPrime = false;
                       break;
                   }
               }
               if (isPrime) {
                   sum = sum + i;
                   list.add(i);
               }
           }
       }

       if (list.size() == 0) {
           System.out.println(-1);
       } else {
           System.out.println(sum);
           System.out.println(list.get(0));
       }
    }
}