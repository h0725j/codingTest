import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] square = new int[9][9];

    // 각 행, 열, 3 * 3 박스에서 숫자 사용 여부를 저장하는 배열
    // [행/열/박스 번호][숫자] = true면 해당 숫자가 사용됨
    static boolean[][] row = new boolean[9][10];
    static boolean[][] col = new boolean[9][10];
    static boolean[][] box = new boolean[9][10];

    // 빈 칸의 위치들을 저장하는 리스트
    static ArrayList<int[]> blank = new ArrayList<>();
    
    // 주어진 행, 열 좌표에서 속하는 3 * 3 박스의 번호를 계산
    static int getBoxIndex(int r, int c) {
        return (r / 3) * 3 + (c / 3);
    }

    static boolean printSquare(int depth) {
        // 모든 빈 칸을 채웠으면 종료
        if (depth == blank.size()) {
            return true;
        }

        int[] current = blank.get(depth); // 현재 처리할 빈 칸의 좌표
        int r = current[0]; // 현재 빈 칸의 행
        int c = current[1]; // 현재 빈 칸의 열
        int b = getBoxIndex(r, c); // 현재 3 * 3 박스 번호

        for (int num = 1; num <= 9; num++) {
            // 해당 숫자가 이미 사용되었는지 확인
            if (row[r][num] || col[c][num] || box[b][num]) {
                continue; // 다음 숫자로 넘어감
            }
            
            // 현재 위치에 숫자 배치
            square[r][c] = num;
            
            // 해당 숫자가 사용되었음을 모든 관련 배열에 표시
            row[r][num] = true;
            col[c][num] = true;
            box[b][num] = true;
            
            // 다음 빈 칸
            if (printSquare(depth + 1)) {
                return true; // 해답을 찾았다면 종료
            }
            
            // 해답이 아니라면 되돌리기
            square[r][c] = 0;
            row[r][num] = false;
            col[c][num] = false;
            box[b][num] = false;
        }

        // 모든 숫자를 시도했지만 해결되지 않음
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 9; j++) {
               int value = Integer.parseInt(tokenizer.nextToken());
               square[i][j] = value;
               
               if (value == 0) {
                   // 빈 칸이면 리스트에 좌표 저장
                   blank.add(new int[]{i, j});
               } else {
                   // 이미 채워진 칸이면 해당 숫자가 사용되었음을 표시
                   row[i][value] = true;
                   col[j][value] = true;
                   box[getBoxIndex(i, j)][value] = true;
               }
            }
        }

        printSquare(0); // 첫 번째 빈 칸부터 처리

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}