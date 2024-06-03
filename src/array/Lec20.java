package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec20 {
    public int[] solution(int n, int[] arr){
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt = 1;
            for(int j=0; j<n; j++)
                if(arr[i] < arr[j])
                    cnt++;
            answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec20 T = new Lec20();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strs = str.split(" ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = Integer.parseInt(strs[i]);
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
