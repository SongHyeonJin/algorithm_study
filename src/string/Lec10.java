package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec10 {
    public int[] solution(String str, char c){
        int[] answer = new int[str.length()-2];
        int p = 101;
        for(int i=0; i<str.length()-2; i++){
            if(str.charAt(i)==c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }
        p = 101;
        for(int i=str.length()-3; i>=0; i--){
            if(str.charAt(i)==c)
                p = 0;
            else{
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec10 T = new Lec10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = str.charAt(str.length()-1);
        for (int x : T.solution(str, c))
            System.out.print(x+" ");
    }
}
