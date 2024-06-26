package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec28 {
    public int solution(int n, int m, int[] arr){
        int answer = 0, lt = 0, rt = 0, sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[rt++];
            if(sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec28 T = new Lec28();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, m, arr));
    }
}
