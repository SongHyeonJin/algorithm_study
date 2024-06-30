package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec60 {
    static int n, f;
    boolean flag = false;
    static int[] board, p, check;
    static int[][] dy = new int[35][35];
    public int combi(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==0 || n==r) return 1;
        else return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
    }
    public void DFS(int L, int sum){
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x : p) System.out.print(x+" ");
                flag = true;
            }
        } else{
            for(int i=1; i<=n; i++){
                if(check[i]==0){
                    check[i]=1;
                    p[L] = i;
                    DFS(L+1, sum+(p[L]*board[L]));
                    check[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Lec60 T = new Lec60();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());
        board = new int[n];
        p = new int[n];
        check = new int[n+1];
        for(int i=0; i<n; i++)
            board[i] = T.combi(n-1, i);
        T.DFS(0, 0);
    }
}
