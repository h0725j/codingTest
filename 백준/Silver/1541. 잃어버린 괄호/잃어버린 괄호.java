import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String[] arr = input.split("-");

        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            String[] numbers = arr[i].split("\\+");
            int sum = 0;

            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }

            if (i == 0) {
                result = sum;
            } else {
                result -= sum;
            }
        }

        System.out.println(result);
    }
}