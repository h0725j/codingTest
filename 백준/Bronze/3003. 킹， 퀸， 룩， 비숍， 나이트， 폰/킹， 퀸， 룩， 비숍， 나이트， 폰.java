import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] pieces = {1, 1, 2, 2, 2, 8};

        int[] input = new int[pieces.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        int[] result = new int[pieces.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = pieces[i] - input[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}