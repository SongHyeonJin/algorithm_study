package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Lec78 {
    static int n, m;
    static int[] dy;
    public int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i=0; i<n; i++){
            for (int j=coin[i]; j<=m; j++){
                dy[j] = Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) throws IOException {
        Lec78 T = new Lec78();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int[] coin = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            coin[i] = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        dy = new int[m+1];
        System.out.println(T.solution(coin));
    }
}
