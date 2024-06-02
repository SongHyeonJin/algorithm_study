package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec19 {
    public int solution(int n, int[] arr){
        int answer = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                cnt += 1;
                answer += cnt;
            }else cnt = 0;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec19 T = new Lec19();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strs = str.split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(strs[i]);
        System.out.println(T.solution(n, arr));
    }
}
