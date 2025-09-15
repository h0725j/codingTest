import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        // 총 이동 횟수 출력(최소 이동 횟수 공식: 2^n - 1
        builder.append((1 << n) - 1).append('\n');

        // 이동 과정 - 1에서 3번 기둥으로 이동(2번 기둥 경유)
        move(n, 1, 3, 2);

        System.out.println(builder);
    }

    // n: 원판 개수, from: 출발 기둥, to: 도착 기둥, via: 경유 기둥(거쳐가는 기둥)
    public static void move(int n, int from, int to, int via) {
        // 원판이 1개면 출발 기둥에서 도착 기둥으로 직접 이동
        if (n == 1) {
            builder.append(from).append(' ').append(to).append('\n');
            return;
        }

        // n - 1개 원판을 경유지로 이동
        move(n - 1, from , via, to);

        // 가장 큰 원판을 목적지로 이동
        builder.append(from).append(' ').append(to).append('\n');

        // n - 1개 원판을 최종 목적지로 이동
        move(n - 1, via, to, from);
    }
}