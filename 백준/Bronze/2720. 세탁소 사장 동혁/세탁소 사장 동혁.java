import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(reader.readLine());

            int quarter = input / 25;
            input = input % 25;

            int dime = input / 10;
            input = input % 10;

            int nickel = input / 5;
            input = input % 5;

            int penny = input;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}