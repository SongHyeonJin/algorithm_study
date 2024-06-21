package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 경로탐색 {
    static int n, m, answer = 0;
    // DFS
//    static int[][] graph;
    // 인접리스트
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
//    public void DFS(int v){
//        if (v==n) answer++;
//        else{
//            for(int i=1; i<=n; i++){
//                if(graph[v][i]==1 && check[i]==0){
//                    check[i]=1;
//                    DFS(i);
//                    check[i]=0;
//                }
//            }
//        }
//    }
    public void DFS(int v){
        if (v==n) answer++;
        else {
            for (int nv : graph.get(v)){
                if(check[nv]==0){
                    check[nv]=1;
                    DFS(nv);
                    check[nv]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        경로탐색 T = new 경로탐색();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
//        graph = new int[n+1][n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++)
            graph.add(new ArrayList<Integer>());
        check = new int[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            graph[a][b] = 1;
            graph.get(a).add(b);
        }
        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
