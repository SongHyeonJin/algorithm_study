package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lec51 {
    public int solution(int n, int m, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length-1;
        for (int i=0; i<n; i++){
            int mid = (lt+rt)/2;
            if(arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            else if (arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec51 T = new Lec51();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        System.out.println(T.solution(n, m, arr));
    }
}
