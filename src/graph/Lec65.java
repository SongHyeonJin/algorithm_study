package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Lec65 {
    static int n, answer=0;
    static int[][] board;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Target> q = new LinkedList<>();
    public void BFS(int x, int y, int[][] board){
        q.offer(new Target(x, y));
        while (!q.isEmpty()){
            Target tmp = q.poll();
            for(int i=0; i<8; i++){
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                    board[nx][ny]=0;
                    q.offer(new Target(nx, ny));
                }
            }
        }
    }
    public void solution(int[][] board){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Lec65 T = new Lec65();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }
        T.solution(board);
        System.out.println(answer);
    }
}
