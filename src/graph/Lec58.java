package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Lec58 {
    static int n, m, answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer[] arr){
        if(sum>m) return;
        if(L>=answer) return;
        if(sum==m) answer = Math.min(answer, L);
        else{
            for(int x : arr)
                DFS(L+1, sum+x, arr);
        }
    }
    public static void main(String[] args) throws IOException {
        Lec58 T = new Lec58();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr, Collections.reverseOrder());

        m = Integer.parseInt(br.readLine());
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
