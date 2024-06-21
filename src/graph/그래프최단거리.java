package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그래프최단거리 {
    static int n, m, answer  = 0;
    static int[] check, dis;
    static ArrayList<ArrayList<Integer>> graph;
    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int cv = queue.poll();
            for (int nv : graph.get(cv)){
                if(check[nv]==0){
                    check[nv]=1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        그래프최단거리 T = new 그래프최단거리();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++)
            graph.add(new ArrayList<Integer>());
        check = new int[n+1];
        dis = new int[n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++)
            System.out.println(i+" : "+dis[i]);
    }
}
