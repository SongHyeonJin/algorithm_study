package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec22 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] check;
    public int solution(int n, int[][] arr){
        int answer = 0;
        check = new boolean[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++) {
                check[i][j] = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
                        check[i][j] = false;
                        break;
                    }
                }
                if(check[i][j]) answer++;
            }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec22 T = new Lec22();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr =  new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n, arr));
    }
}
