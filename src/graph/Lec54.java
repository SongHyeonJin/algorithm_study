package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Lec54 {
    static int cnt = 1;
    static int[] dist = {1, -1, 5};
    static boolean[] chk;
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int s, int e){
        chk = new boolean[10001];
        chk[s] = true;
        queue.offer(s);
        while (!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int x = queue.poll();
                for(int j=0; j<3; j++){
                    int nx = x+dist[j];
                    if(nx == e) return cnt;
                    if(!chk[nx] && nx>=1 && nx<=10000){
                        chk[nx] = true;
                        queue.offer(nx);
                    }
                }
            }
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Lec54 T = new Lec54();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        System.out.println(T.BFS(s, e));
    }
}
