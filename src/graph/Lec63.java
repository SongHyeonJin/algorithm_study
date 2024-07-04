package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Target {
    int x, y;

    public Target(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Lec63 {
    static int n, m;
    static int[][] board, dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Target> q = new LinkedList<>();
    public void BFS(){
        while (!q.isEmpty()){
            Target tmp = q.poll();
            for(int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=0 && nx<m && ny>=0 && ny<n && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    q.offer(new Target(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Lec63 T = new Lec63();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[m][n];
        dis = new int[m][n];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j]==1) q.offer(new Target(i, j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(board[i][j]==0) flag = false;
        if(flag){
            for(int i=0; i<m; i++)
                for(int j=0; j<n; j++)
                    answer = Math.max(answer, dis[i][j]);
            System.out.println(answer);
        }
        else System.out.println(-1);
    }
}
