package two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec30 {
    public int solution(int n, int k, int[] arr){
        int answer = 0, cnt = 0, lt = 0;
        boolean[] check = new boolean[n];
        for(int rt=0; rt<n; rt++){
            check[rt] = false;
            if(arr[rt] == 0) {
                arr[rt] = 1;
                check[rt] = true;
                cnt++;
            }
            while (cnt > k){
                if(check[lt]){
                    arr[lt] = 0;
                    cnt--;
                    check[lt] = false;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec30 T = new Lec30();
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
