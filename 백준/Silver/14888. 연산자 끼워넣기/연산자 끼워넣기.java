import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n; // 수의 개수
    static int[] arr; // 수 배열
    static int[] math = new int[4]; // 사칙연산 배열
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    // result: 현재까지의 연산 결과, index: 다음에 연산할 arr 배열의 인덱스
    static void solve(int result, int index) {
        if (index == n) { // 인덱스가 끝나면
            if (result > max) max = result; // 최댓값 재정의
            if (min > result) min = result; // 최솟값 재정의
            return;
        }

        for (int i = 0; i < 4; i++) { // 사칙연산 반복문
            if (math[i] > 0) { // 연산의 개수가 남아있으면
                math[i]--; // 빼기

                int newResult; // 새로운 결과값
                // 헤딩하는 사칙연산 수행
                if (i == 0) newResult = result + arr[index];
                else if (i == 1) newResult = result - arr[index];
                else if (i == 2) newResult = result * arr[index];
                else newResult = result / arr[index];

                // 새로운 결과값과 다음 인덱스로 재귀 호출
                solve(newResult, index + 1);
                math[i]++; // 백트래킹: 연산자 개수 복원하여 다른 경우 탐색

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        arr = new int[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < 4; i++) {
            math[i] = Integer.parseInt(tokenizer.nextToken());
        }

        solve(arr[0], 1); // 첫 번째 수를 초기값으로, 두 번째 수부터 연산 시작

        System.out.println(max);
        System.out.println(min);
    }
}