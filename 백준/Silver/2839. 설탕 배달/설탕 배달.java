import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        
        while (n >= 0) {
            if (n % 5 == 0) { // 5키로 단위로 딱 나누어 떨어지면
                count += n / 5;
                System.out.println(count);
                return;
            }
            n -= 3; // 3키로 봉지 하나 사용
            count++; // 봉지 개수 카운트 증가
        }
        // 나누어 떨어지지 않으면 -1 출력
        System.out.println(-1);
    }
}