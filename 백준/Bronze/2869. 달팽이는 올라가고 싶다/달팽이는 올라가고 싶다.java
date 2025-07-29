import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int A = Integer.parseInt(tokenizer.nextToken()); // 달팽이가 낮에 오를 수 있는 높이
        int B = Integer.parseInt(tokenizer.nextToken()); // 달팽이가 밤에 미끄러지는 높이
        int V = Integer.parseInt(tokenizer.nextToken());// 나무 막대의 높이
        
        int count = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            count++;
        }
        
        System.out.println(count);
    }
}