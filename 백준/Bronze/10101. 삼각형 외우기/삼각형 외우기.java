import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if ((a + b + c) == 180) {
            if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
            System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}