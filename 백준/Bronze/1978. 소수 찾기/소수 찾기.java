import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int N = Integer.parseInt(reader.readLine());

       StringTokenizer tokenizer = new StringTokenizer(reader.readLine());


       List<Integer> list = new ArrayList<>();
       int cnt = 0;

       for (int i = 0; i < N; i++) {
           list.add(Integer.parseInt(tokenizer.nextToken()));
       }

        for (int i = 0; i < N; i++) {
            int num = list.get(i);
            if (num > 1) { // 소수는 1보다 큼
                boolean isPrime = true;
                
                for (int j = 2; j < num; j++) { // 1과 num이 아닌 수가
                    if (num % j == 0) { // num의 약수라면
                        isPrime = false; // 소수가 아님
                        break;
                    }
                }
                
                if (isPrime) {
                    cnt++;
                }
            }
        }
       System.out.println(cnt);
    }
}