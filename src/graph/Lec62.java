package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point{
    public int x, y, dist;

    public Point(int x, int y, int dist) {
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
public class Lec62 {
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int BFS(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y, 0));
        visited[x][y] = true;
        while (!queue.isEmpty()){
            Point tmp = queue.poll();
            if(tmp.x==7 && tmp.y==7) return tmp.dist;
            for(int i=0; i<4; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>0 && nx<=7 && ny>0 && ny<=7 && board[nx][ny]==0 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny, tmp.dist+1));
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        Lec62 T = new Lec62();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        visited = new boolean[8][8];
        for(int i=1; i<=7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }
        int result = T.BFS(1, 1);
        System.out.println(result);
    }
}
