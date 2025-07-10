import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int count = 0;

        for (int i = 0; i < num; i++) {
            if(check(reader.readLine())) {
                count++;
            }
        }
        reader.close();
        System.out.println(count);



    }

    static boolean check(String input) {
        boolean[] check = new boolean[26]; // 알파벳 개수만큼 배열 생성
        int prev = -1; // 이전 문자의 인덱스값

        for (int i = 0; i < input.length(); i++) {
            int now = input.charAt(i); // 현재 문자의 아스키 코드값

            if (prev != now) { // 이전 문자와 현재 문자가 같지 않다면
                if (!check[now - 97]) { // false -> 처음 나온 문자
                    check[now - 97] = true; // 다음에 나오면 두번 나온 문자
                    prev = now; // 이전 문자로 바꿔주기
                } else { // 이미 나온 적이 있는 경우
                    return false;
                }
            }
        }
        return true; // 그룹 문자
    }
}