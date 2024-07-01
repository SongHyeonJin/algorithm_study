package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec61 {
    static int answer = 0;
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public void DFS(int x, int y){
        if(x==7 && y==7) answer++;
        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>0 && nx<=7 && ny>0 && ny<=7 && board[nx][ny]==0){
                board[nx][ny]=1;
                DFS(nx, ny);
                board[nx][ny]=0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Lec61 T = new Lec61();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        for(int i=1; i<=7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++)
                board[i][j] = Integer.parseInt(st.nextToken());
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
