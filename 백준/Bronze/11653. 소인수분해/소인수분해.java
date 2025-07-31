import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        if (N > 1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    list.add(i);
                }
            }
            while (true){
                if (N > 1){
                    if (N % list.get(0) == 0) {
                        System.out.println(list.get(0));
                        N = N / list.get(0);
                    } else {
                        list.remove(list.get(0));
                    }
                } else {
                    break;
                }
            }
        }
    }
}