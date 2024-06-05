package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec27 {
    public int solution(int n, int k, int[] arr){
        int answer, sum = 0;
        for(int i=0; i<k; i++) sum += arr[i];
        answer = sum;
        for(int i=k; i<n; i++){
            sum += (arr[i]- arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec27 T = new Lec27();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, k, arr));
    }
}
