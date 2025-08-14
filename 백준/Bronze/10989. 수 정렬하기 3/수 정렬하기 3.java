import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 출력 속도 향상을 위해 결과를 한 번에 모을 StringBuilder
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            // 입력받은 숫자의 개수를 count 배열에 기록
            count[Integer.parseInt(reader.readLine())]++;
        }

        for (int i = 0; i <= 10000; i++) {
            // count[i]가 0보다 크면, 해당 숫자가 등장한 횟수만큼 출력
            while (count[i] > 0) {
                builder.append(i).append('\n');
                // 한 번 출력했으니 그 숫자의 남은 개수를 감소
                count[i]--;
            }
        }

        // StringBuilder에 모아둔 모든 결과를 한 번에 출력
        System.out.print(builder);
    }
}