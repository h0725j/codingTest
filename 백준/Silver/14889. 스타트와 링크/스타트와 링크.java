import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n; // 전체 축구 인원 수
    static int[][] power; // 선수듥 간의 능력치 배열
    static boolean[] visited; // true: 스타트팀, false: 링크팀
    static int min = Integer.MAX_VALUE; // 두 팀 간 능력치 차이의 최솟값

    // depth: 현재까지 스타트팀에 선택된 선수 수, index: 조합 생성을 위한 탐색 시작 위치
    static void backTrack(int depth, int index) {
        // 스타트팀에 n/2명이 모두 선택되었을 때
        if (depth == (n / 2)) {
            int startSum = 0, linkSum = 0;

            // 스타트팀과 링크팀의 능력치 계산
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (visited[i] && visited[j]) {
                        startSum += power[i][j] + power[j][i];
                    } else if (!visited[i] && !visited[j]) {
                        linkSum += power[i][j] + power[j][i];
                    }
                }
            }

            // 두 팀의 능력치 차이 계산
            int result = Math.abs(startSum - linkSum);

            if (result < min) min = result;
            return;
        }

        for (int i = index; i < n; i++) {
            // 현재 선수가 아직 선택되지 않았다면
            if (!visited[i]) {
                visited[i] = true; // i번 사람을 스타트팀에 추가
                backTrack(depth + 1, i + 1); // 다음 사람 선택
                visited[i] = false; // 백트래킹: 선택 취소하여 다른 경우 탐색
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        power = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < n; j++) {
                power[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        visited[0] = true; // 0번 선수를 항상 스타트팀에 고정
        backTrack(1, 1); // 1명 선택된 상태로 시작

        System.out.println(min);
    }
}