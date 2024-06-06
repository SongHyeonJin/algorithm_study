package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec29 {
    public int solution(int n){
        int answer = 0, sum = 0, lt = 0;
        int half = n/2 + 1;
        int[] arr = new int[half];
        for(int i=0; i<half; i++) arr[i] = i+1;
        for(int rt=0; rt<half; rt++){
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec29 T = new Lec29();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
