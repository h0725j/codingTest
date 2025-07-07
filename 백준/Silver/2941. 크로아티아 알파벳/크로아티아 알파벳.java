import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;

        String[] words = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i = 0; i < words.length; i++) {
            if (input.contains(words[i])) {
                input = input.replace(words[i], "?");
            }
        }

        System.out.println(input.length());
    }
}