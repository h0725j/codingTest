import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] input = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            for (int j = 0; j < str.length(); j++) {
                input[i][j] = str.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (input[i][j] == '\0') continue;
                System.out.print(input[i][j]);
            }
        }
    }
}