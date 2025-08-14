import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(num);
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}