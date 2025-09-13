import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int cnt = 0; // 배열에 값이 저장된 총 횟수를 세는 카운터
    static int result = -1; // K번째로 저장되는 값 (없으면 -1 유지)
    static int K; // 찾고자 하는 K번째 저장 순서

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken()); // 배열 크기
        int k = Integer.parseInt(tokenizer.nextToken()); // k번째

        K = k; // 전역변수에 저장
        int[] arr = new int[n];

        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        // 전체 배열(0부터 n-1까지 병합정렬)
        mergeSort(arr, 0, n - 1);
        
        System.out.println(result);
    }

    // 분할정복을 이용한 병합정렬 함수
    // arr: 정렬한 배열, p: 정렬한 구간의 시작 인덱스, r: 정렬한 구간의 끝 인덱스
    public static void mergeSort(int[] arr, int p, int r) {
        if (p < r) { // 구간에 원소가 2개 이상일 때만 분할
            // 중간점 계산
            int q = (p + r) / 2;

            // 왼쪽 절반 재귀 정렬
            mergeSort(arr, p, q);
            
            // 오른쪽 절반 재귀 정렬
            mergeSort(arr, q + 1, r);
            
            // 정복: 정렬된 두 부분을 병합하여 전체를 정렬
            merge(arr, p, q, r);
        }
    }

    // 두 개의 정렬된 부분 배열을 합쳐서 하나의 정렬된 배열을 만드는 함수
    // arr: 원본 배열, p: 첫 번째 부분배열의 시작 인덱스
    // q: 첫 번째 부분배열의 끝 인덱스 (두 번째는 q+1부터 시작), r: 두 번째 부분배열의 끝 인덱스
    public static void merge(int[] arr, int p, int q, int r) {
        // 인덱스 초기화
        int i = p ; // 왼쪽 부분배열의 현재 위치 (p ~ q)
        int j = q + 1; // 오른쪽 부분배열의 현재 위치 (q+1 ~ r)
        int t = 1; // 임시배열의 인덱스 (1부터 시작)
        
        // 임시배열: 병합 결과를 저장할 공간
        int[] tmp = new int[r - p + 2];

        // 두 부분배열을 비교하면서 작은 값부터 저장
        while ( i <= q && j <= r) { // 양쪽 모두애 원소가 남아있는 동안
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        // 왼쪽 부분배열에 남은 원소들 처리
        while (i <= q) tmp[t++] = arr[i++];
        
        // 오른쪽 부분배열에 남은 원소들 처리
        while (j <= r) tmp[t++] = arr[j++];

        // 임시배열의 정렬된 결과를 원본배열에 복사
        i = p; t = 1; // 인덱스 초기화: 원본배열 p위치부터, 임시배열 1위치부터
        
        while (i <= r) { // 정렬 구간 전체에 대해
            arr[i++] = tmp[t++]; 
            cnt++; // 저장 횟수 카운터 증가

            if (cnt == K) {
                result = arr[i - 1]; // 방금 저장된 값을 결과로 저장
                return; // 종료
            }
        }
    }
}