package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec59 {
    static int n, r;
    static int[][] dy = new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==0 || n==r) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        Lec59 T = new Lec59();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        System.out.println(T.DFS(n, r));
    }
}
