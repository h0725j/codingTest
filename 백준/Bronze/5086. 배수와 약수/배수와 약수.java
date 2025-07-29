import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i < 10000; i++) {
           StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
           int first = Integer.parseInt(tokenizer.nextToken());
           int second = Integer.parseInt(tokenizer.nextToken());

           if (first == second) {
               break;
           }

           if (second % first == 0) {
               System.out.println("factor");
           } else if (first % second == 0) {
               System.out.println("multiple");
           } else {
               System.out.println("neither");
           }
       }
    }
}