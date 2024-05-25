package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec6 {
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(i != str.indexOf(str.charAt(i)))
                continue;
            answer += str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec6 T = new Lec6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
