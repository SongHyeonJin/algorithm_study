package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec14 {
    public int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                answer += 1;
                max = arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec14 T = new Lec14();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strs = str.split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(strs[i]);
        System.out.print(T.solution(n, arr));
    }
}
