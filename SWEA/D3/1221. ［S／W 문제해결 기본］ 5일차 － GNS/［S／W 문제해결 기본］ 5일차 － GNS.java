import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String test = tokenizer.nextToken();
            int len = Integer.parseInt(tokenizer.nextToken());

            ArrayList<Integer> nums = new ArrayList<>();
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < len; j++) {
                String s = tokenizer.nextToken();
                switch (s) {
                    case "ZRO": nums.add(0);
                        break;
                    case "ONE": nums.add(1);
                        break;
                    case "TWO": nums.add(2);
                        break;
                    case "THR": nums.add(3);
                        break;
                    case "FOR": nums.add(4);
                        break;
                    case "FIV": nums.add(5);
                        break;
                    case "SIX": nums.add(6);
                        break;
                    case "SVN": nums.add(7);
                        break;
                    case "EGT": nums.add(8);
                        break;
                    case "NIN": nums.add(9);
                        break;
                }
            }

            nums.sort(Integer::compareTo);

            builder.append(test).append("\n");
            for (Integer num : nums) {
                switch (num) {
                    case 0:
                        builder.append("ZRO").append(" ");
                        break;
                    case 1:
                        builder.append("ONE").append(" ");
                        break;
                    case 2:
                        builder.append("TWO").append(" ");
                        break;
                    case 3:
                        builder.append("THR").append(" ");
                        break;
                    case 4:
                        builder.append("FOR").append(" ");
                        break;
                    case 5:
                        builder.append("FIV").append(" ");
                        break;
                    case 6:
                        builder.append("SIX").append(" ");
                        break;
                    case 7:
                        builder.append("SVN").append(" ");
                        break;
                    case 8:
                        builder.append("EGT").append(" ");
                        break;
                    case 9:
                        builder.append("NIN").append(" ");
                        break;
                }
            }
            builder.append("\n");
        }
        System.out.println(builder);
    }
}