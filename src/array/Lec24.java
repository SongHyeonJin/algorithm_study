package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lec24 {
    public int solution(int n, int m, int[][] arr){
        int answer = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){
                    int studentI = 0;
                    int studentJ = 0;
                    for(int l=0; l<n; l++){
                        if(arr[k][l] == i) studentI = l;
                        if(arr[k][l] == j) studentJ = l;
                    }
                    if(studentI < studentJ) cnt++;
                }
                if(cnt == m) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec24 T = new Lec24();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
