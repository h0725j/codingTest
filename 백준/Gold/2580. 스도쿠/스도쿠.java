import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] square = new int[9][9];

    // 0으로 표시된 위치들을 저장하는 리스트
    static ArrayList<int[]> blank = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 9; j++) {
                square[i][j] = Integer.parseInt(tokenizer.nextToken());
                if (square[i][j] == 0) { // 0을 발견하면 좌표를 리스트에 저장
                    blank.add(new int[]{i, j});
                }
            }
        }

        printSquare(0); // 첫 번째 0부터 처리

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 특정 위치에 특정 숫자를 놓을 수 있는지 검사
    static boolean isValid(int row, int col, int num) {
        // 같은 행에 동일한 숫자가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (square[row][i] == num) {
                return false;
            }
        }

        // 같은 열에 동일한 숫자가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (square[i][col] == num) {
                return false;
            }
        }

        // 같은 3 * 3 박스 내에 동일한 숫자가 있는지 검사
        int miniRow = (row / 3) * 3;
        int miniCol = (col / 3) * 3;
        for (int i = miniRow; i < miniRow + 3; i++) {
            for (int j = miniCol; j < miniCol + 3; j++) {
                if (square[i][j] == num) {
                    return false;
                }
            }
        }

        // 모든 조건을 통과하면 해당 위치에 숫자 배치 가능
        return true;
    }

    static boolean printSquare(int depth) {
        // 모든 빈 칸을 채웠으면 종료
        if (depth == blank.size()) {
            return true;
        }

        int[] current = blank.get(depth); // 현재 처리할 빈 칸의 좌표
        int row = current[0]; // 현재 빈 칸의 행
        int col = current[1]; // 현재 빈 칸의 열

        for (int num = 1; num <= 9; num++) {
            // 현재 위치에 num을 놓을 수 있는지 검사
            if (isValid(row, col, num)) {
                // 가능하다면 숫자를 배치
                square[row][col] = num;

                // 다음 단계에서 해결되면 true 반환
                if (printSquare(depth + 1)) {
                    return true;
                }

                // 다음 단계에서 해결되지 않았다면 다른 숫자를 시도
                square[row][col] = 0;
            }
        }

        // 이전 단계로 돌아가서 다른 경우를 시도하도록 false 반환
        return false;
    }
}