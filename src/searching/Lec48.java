package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lec48 {
    public String solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for(int i=1; i<n; i++){
            if(arr[i] == arr[i-1]) return "D";
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec48 T = new Lec48();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, arr));
    }
}
