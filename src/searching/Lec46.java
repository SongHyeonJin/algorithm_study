package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec46 {
    public int[] solution(int n, int[] arr){
        for (int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        Lec46 T = new Lec46();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for (int x : T.solution(n, arr)) System.out.print(x+" ");
    }
}
