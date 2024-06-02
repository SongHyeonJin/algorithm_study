package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec16 {
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = answer[1] = 1;
        for(int i=2; i<n; i++)
            answer[i] = answer[i-2] + answer[i-1];
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec16 T = new Lec16();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int x : T.solution(n)) System.out.print(x + " ");
    }
}
