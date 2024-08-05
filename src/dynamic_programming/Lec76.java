package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec76 {
    static int[] dy;
    public int solution(int[] arr){
        int answer=0;
        dy = new int[arr.length];
        dy[0]=1;
        for(int i=1; i<arr.length; i++){
            int max=0;
            for(int j=i-1; j>=0; j--)
                if(arr[j]<arr[i] && dy[j]>max) max = dy[j];
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec76 T = new Lec76();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(arr));
    }
}
