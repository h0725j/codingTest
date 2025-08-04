import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            List<Integer> list = new ArrayList<>();

            list.add(a);
            list.add(b);
            list.add(c);

            Collections.sort(list);

            if (list.get(list.size() - 1) >= list.get(0) + list.get(1)) {
                System.out.println("Invalid");
            } else {
                if(a == b && b == c) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}