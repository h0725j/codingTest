import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        reader.close();

        int count = 1; // 해당 대각선에 있는 칸의 개수
        int sum = 0; // 해당 대각선의 직전 대각선까지의 칸의 누적 합

        while (true) {
            // 해당 대각선의 직전 대각선까지의 칸의 누적 합 + 현재 대각선애 있는 칸의 개수보다 x번째가 작다는 것은
            // 현재 해당하는 대각선에 x번째 분수가 있다는 것
            if (x <= count + sum) {
                if (count % 2 == 1) { // 대각선의 개수가 홀수라면
                    // 대각선의 개수가 홀수인 범위: 위쪽 순회 -> 분자 감소, 분모 증가
                    // 분자: 대각선상 블럭의 개수 - (x번째 - 직전 대각선까지의 블럭 개수 - 1)
                    // 분모: x번째 - 직전 대각선까지의 블럭 개수
                    System.out.println((count - (x - sum - 1)) + "/" + (x - sum));
                    break;
                }
                else { // 대각선의 개수가 짝수라면
                    // 대각선의 개수가 짝수인 범위: 아래쪽 순회 -> 분자 증가, 분모 감소
                    // 홀수일 때의 출력을 반대로
                    System.out.println((x - sum) + "/" + (count - (x - sum - 1)));
                    break;
                }
            } else { // 아직 x번째 분수가 해당 대각선에 포함되지 않는 경우
            sum += count;
            count++; // 대각선이 증가될 때마다 칸의 개수도 +1 증가하기 때문
            }
        }
    }
}