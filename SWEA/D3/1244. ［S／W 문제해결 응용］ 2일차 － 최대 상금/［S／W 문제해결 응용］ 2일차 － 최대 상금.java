import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution {
    static int result; // 최대 상금
    static char[] nums; // 숫자판의 각 자릿수를 저장할 배열
    static int cnt; // 반드시 교환해야 하는 횟수
    static Set<String> visited; // 중복 방지
    static int maxPossible;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            String num = tokenizer.nextToken();
            cnt = Integer.parseInt(tokenizer.nextToken());

            nums = num.toCharArray();
            result = 0;
            visited = new HashSet<>();

            char[] sorted = num.toCharArray();
            Arrays.sort(sorted);
            StringBuilder sb = new StringBuilder(new String(sorted));
            maxPossible = Integer.parseInt(sb.reverse().toString());

            dfs(0);

            builder.append("#").append(i).append(" ").append(result).append("\n");
        }

        System.out.println(builder);
    }

    static void dfs(int count) {// count: 현재까지 교환한 횟수
        if (result == maxPossible) {
            return;
        }

        if (count == cnt) { // k번 교환을 완료했다면
            int current = Integer.parseInt(new String(nums));
            result = Math.max(result, current); // 현재 숫자판의 숫자로 최댓값 갱신
            return;
        }

        String state = new String(nums) + count;
        if (visited.contains(state)) {
            return;
        }
        visited.add(state);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                char temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

               dfs(count + 1);

                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
}