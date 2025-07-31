import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> xlist = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            xlist.add(x);
            ylist.add(y);
        }
        if (xlist.get(0).equals(xlist.get(1))) {
            if (!xlist.get(1).equals(xlist.get(2))) {
                System.out.print(xlist.get(2) + " ");
            }
        } else if (xlist.get(0).equals(xlist.get(2))) {
            System.out.print(xlist.get(1) + " ");
        }
        else {
            if (xlist.get(1).equals(xlist.get(2))) {
                System.out.print(xlist.get(0) + " ");
            }
        }
        if (ylist.get(0).equals(ylist.get(1))) {
            if (!ylist.get(1).equals(ylist.get(2))) {
                System.out.print(ylist.get(2));
            }
        } else if (ylist.get(0).equals(ylist.get(2))) {
            System.out.print(ylist.get(1));
        }
        else {
            if (ylist.get(1).equals(ylist.get(2))) {
                System.out.print(ylist.get(0));
            }
        }
    }
}