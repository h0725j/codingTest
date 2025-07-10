import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        double totalGrade = 0; // 학점의 총합
        double totalScores = 0; // (학점 * 과목평점)의 총합

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            tokenizer.nextToken(); // 과목명 제외
            double score = Double.parseDouble(tokenizer.nextToken()); // 학점
            String grade = tokenizer.nextToken(); // 등급

            if (grade.equals("P")) // P 제외
                continue;

            double gradeScore = getGradeScore(grade);
            totalGrade += score;
            totalScores += score * gradeScore;
        }

        System.out.println(totalScores / totalGrade);
    }

    public static double getGradeScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            default:
                return 0.0;
        }
    }
}