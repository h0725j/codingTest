import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());

            listX.add(x);
            listY.add(y);
        }

        listX.sort(Collections.reverseOrder());
        listY.sort(Collections.reverseOrder());

        System.out.println((listX.get(0)-listX.get(listX.size() - 1)) * (listY.get(0)-listY.get(listY.size() - 1)));
    }
}