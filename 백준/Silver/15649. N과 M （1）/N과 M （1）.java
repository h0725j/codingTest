import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m; // 입력값: 1~n 중에서 m개 선택
    static boolean[] visited; // 방문 체크
    static int[] arr; // 현재 선택된 수들을 저장
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());

        visited = new boolean[n + 1];
        arr = new int[m];

        backtrack(0); // 첫 번째 자리부터 시작
        System.out.println(result);
    }

    public static void backtrack(int depth) {
        if (depth == m) { // m을 모두 선택했을 때
            for (int j : arr) { // 현재까지 선택한 수들을 결과에 추가
                result.append(j).append(" ");
            }
            result.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (visited[i]) { // 이미 사용한 수는 건너뛰기
                continue;
            }

            visited[i] = true; // i번 숫자를 "사용중"으로 표시
            arr[depth] = i; // depth번째 자리에 i 저장

            backtrack(depth + 1); // 다음 자리 채우러 가기

            visited[i] = false; // i번 숫자를 "사용안함"으로 되돌리기
        }
    }
}