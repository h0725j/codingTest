import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 0; tc < 10; tc++) {
            int t = Integer.parseInt(reader.readLine());

            char[][] matrix = new char[100][100];
            for (int i = 0; i < 100; i++) {
                String line = reader.readLine();
                for (int j = 0; j < 100; j++) {
                    matrix[i][j] = line.charAt(j);
                }
            }

            int maxLen = 1;

            for (int length = 100; length > 1; length--) {
                boolean found = false;

                for (int row = 0; row < 100; row++) {
                    for (int start = 0; start <= 100 - length; start++) {
                        if (isPalindrome(matrix[row], start, length)) {
                            maxLen = length;
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;

                for (int col = 0; col < 100; col++) {
                    char[] colArr = new char[100];
                    for (int row = 0; row < 100; row++) {
                        colArr[row] = matrix[row][col];
                    }
                    for (int start = 0; start <= 100 - length; start++) {
                        if (isPalindrome(colArr, start, length)) {
                            maxLen = length;
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
                if (found) break;
            }
            System.out.println("#" + t + " " + maxLen);
        }
    }

    static boolean isPalindrome(char[] arr, int start, int length) {
        int end = start + length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}