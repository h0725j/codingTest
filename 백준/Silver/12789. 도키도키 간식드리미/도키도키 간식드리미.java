import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 현재 줄에서 순서대로 처리
// 순서가 맞지 않으면 스택으로 보내기
// 스택에서 순서가 맞으면 꺼내기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        Stack<Integer> stack = new Stack<>();
        int current = 1; // 현재 받아야 할 번호

        for (int i = 0; i < n; i++) {
            int student = Integer.parseInt(tokenizer.nextToken());

            // 현재 학생이 받을 순서가 맞으면
            if (student == current) {
                current++;
            } else {
                // 맞지 않으면 스택에 보관
                stack.push(student);
            }
            
            // current가 증가한 직후에 스택에서 나올 수 있는 학생을 처리
            // ex) 1이 들어왔을 때 간식을 받고 스택에 2가 있으면 즉시 꺼내서 처리
            while (!stack.isEmpty() && stack.peek() == current) {
                stack.pop();
                current++;
            }
        }

        // 모든 학생을 다 받은 후 스택에 남아 있는 학생들 중 순서대로 나올 수 있는 학생 꺼내기
        while (!stack.isEmpty() && stack.peek() == current) {
            stack.pop();
            current++;
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}