package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec17 {
    public int solution(int n){
        int answer = 0;
        int[] chk = new int[n+1];
        for(int i=2; i<=n; i++){
            if(chk[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i) chk[j] = 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec17 T = new Lec17();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(T.solution(n));
    }
}
