import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        System.out.println((int) Math.pow(Math.sqrt(Math.pow(4, n))+ 1, 2));
    }
}