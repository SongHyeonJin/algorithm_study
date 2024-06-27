package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec57 {
    static int answer = Integer.MIN_VALUE, n, m;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt){
        if(time>m) return;
        if(L==n)
            answer = Math.max(sum, answer);
        else {
            DFS(L+1, sum+ps[L], time+pt[L], ps, pt);
            DFS(L+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) throws IOException {
        Lec57 T = new Lec57();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
