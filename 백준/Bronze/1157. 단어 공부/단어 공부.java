import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 'A';
            count[num]++;
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                result = (char)(i + 'A');
            } else if (max == count[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}