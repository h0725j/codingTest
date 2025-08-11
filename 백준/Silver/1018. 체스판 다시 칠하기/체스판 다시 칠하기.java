import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken()); // 행 개수
        int m = Integer.parseInt(tokenizer.nextToken()); // 열 개수

        // 보드를 char 2차원 배열로 입력 받기
        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = reader.readLine().toCharArray();
        }

        int minChange = Integer.MAX_VALUE; // 최소 칠하기 횟수 저장 변수

        // 모든 8×8 체스판 시작 위치 탐색
        // 시작 좌표 (startRow, startCol)는 8칸을 벗어나지 않는 범위까지
        for (int startRow = 0; startRow <= n - 8; startRow++) { // 시작 행
            for (int startCol = 0; startCol <= m - 8; startCol++) { // 시작 열
                // 시작색이 W일 때 칠해야 하는 칸 수
                int countW = count(board, startRow, startCol, 'W');
                // 시작색이 B일 때 칠해야 하는 칸 수
                int countB = count(board, startRow, startCol, 'B');
                // 두 경우 중 최소값을 전체 최소값과 비교하여 갱신
                minChange = Math.min(minChange, Math.min(countW, countB));
            }
        }

        // 결과 출력
        System.out.println(minChange);
    }

    // 8×8 영역을 시작색(startColor) 패턴으로 만들기 위해 칠해야 하는 칸 수를 계산
    private static int count(char[][] board, int row, int col, char startColor) {
        int count = 0; // 칠해야 하는 칸 수
        char color;    // 현재 위치에서 기대되는 색

        for (int i = 0; i < 8; i++) { // 8행
            for (int j = 0; j < 8; j++) { // 8열
                // (i+j) 합이 짝수면 시작색, 홀수면 반대색이어야 함
                if ((i + j) % 2 == 0) { // 짝수
                    color = startColor;
                } else { // 홀수
                    if (startColor == 'W') {
                        color = 'B';
                    } else {
                        color = 'W';
                    }
                }

                // 현재 보드 칸의 색이 기대 색과 다르면 칠해야 하므로 count 증가
                if (board[row + i][col + j] != color) {
                    count++;
                }
            }
        }
        return count;
    }
}
