package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec56 {
    static int answer = Integer.MIN_VALUE, c, n;
    public void DFS(int L, int sum, int[] arr) {
        if(sum>c) return;
        if(L==n)
            answer = Math.max(answer, sum);
        else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
    public static void main(String[] args) throws IOException {
        Lec56 T = new Lec56();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
