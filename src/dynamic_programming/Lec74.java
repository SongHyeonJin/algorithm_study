package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec74 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++){
            dy[i] = dy[i-2]+dy[i-1];
        }
        return dy[n];
    }
    public static void main(String[] args) throws IOException {
        Lec74 T = new Lec74();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dy = new int[n+1];
        System.out.println(T.solution(n));
    }
}
