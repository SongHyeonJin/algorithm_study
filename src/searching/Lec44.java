package searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lec44 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int idx = i;
            for (int j=i+1; j<n; j++){
                if(arr[idx] > arr[j]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
            answer.add(arr[i]);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec44 T = new Lec44();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        for (int x : T.solution(n, arr)) System.out.print(x+" ");
    }

}
