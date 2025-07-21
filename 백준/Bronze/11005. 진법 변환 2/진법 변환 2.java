import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());

        int input = Integer.parseInt(stringTokenizer.nextToken()); // B진법 수 N
        int num = Integer.parseInt(stringTokenizer.nextToken()); // B진법
        StringBuilder result = new StringBuilder();

        while (input > 0) { // input이 0이 될 때까지 반복
            if (input % num >= 10) { // 나머지가 10보다 크면
                result.append((char) (input % num + 55)); // 알파벳으로 변환해서 문자열에 추가
            } else { // 10보다 작으면
                result.append(input % num); // 그대로 문자열에 추가
            }
            input = input / num; // input을 num으로 나눈 몫 저장
        }
        System.out.println(result.reverse()); // 역순으로 나열
    }
}