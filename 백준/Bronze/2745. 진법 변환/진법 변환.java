import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        String input = stringTokenizer.nextToken(); // B진법 수 N
        int num = Integer.parseInt(stringTokenizer.nextToken()); // B진법
        int result, sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ( 'A' <= c && c <= 'Z' ) { // N이 문자라면
                result = c - 55; // 숫자로 만들어주기
            } else { // 문자가 아니면
                result = c - '0'; // '0'을 빼서 그대로 숫자
            }
            sum = sum + (int) Math.pow(num, input.length()-i-1) * result; // B를 자리에 해당하는 제곱 * result
        }
        System.out.println(sum);
    }
}