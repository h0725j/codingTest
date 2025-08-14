import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < 3000000) {
            i++;
            if (String.valueOf(i).contains("666")) {
                list.add(i);
            }
        }

        System.out.println(list.get(n-1));
    }
}