import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100]; // 흰색 도화지
        int result = 0; // 색종이가 붙은 검은 영역의 넓이
        int n = scanner.nextInt(); // 색종이의 수 

        for (int i = 0; i < n; i++) {
            int w = scanner.nextInt(); // 첫 번째 자연수
            int h = scanner.nextInt(); // 두 번째 자연수

            for (int j = w; j < w + 10; j++) { // 색종이의 가로 길이
                for (int k = h; k < h + 10; k++) { // 색종이의 세로 길이
                    if (!paper[j][k]) { 
                        paper[j][k] = true;
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}