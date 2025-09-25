import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(reader.readLine());

        arr = new int[n]; // n개의 행에 대해 퀸의 위치를 저장할 배열

        queen(0); // 0번 행부터 시작

        System.out.println(count);
    }

    public static void queen(int depth) {
        if (depth == n) { // 모든 행에 퀸을 성공적으로 배치한 경우
            count++; // 가능한 경우의 수 증가
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i; // 현재 depth행의 i열에 퀸 배치

            if (possible(depth)) { // 현재 위치에 퀸을 놓는 것이 가능한지 검사
                queen(depth + 1); // 가능하면 다음 행으로 진행
            }
            // 불가능하다면 다른 열 위치 시도
        }
    }

    // 현재 배치된 퀸이 유효한 위치인지 검사
    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) { // 현재 행 이전의 모든 행들과 검사
            if (arr[i] == arr[col]) { // 같은 열에 퀸이 있는지 검사
                return false; // 같은 열에 퀸이 있으면 배치 불가능
            }

            // 대각선에 퀸이 있는지 검사
            // 두 점이 대각선상에 있으려면: |행의 차이| = |열의 차이|
            // Math.abs(col - i) : 현재 퀸과 i행 퀸 사이의 행 차이
            // Math.abs(arr[col] - arr[i]) : 현재 퀸과 i행 퀸 사이의 열 차이
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false; // 대각선상에 퀸이 있으면 불가능
            }
        }

        // 모든 검사를 통과하면 현재 위치에 퀸 배치 가능
        return true;
    }
}