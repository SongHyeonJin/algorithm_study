package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec2 {
    public String solution(String str){
        String answer = "";
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c))
                c = Character.toLowerCase(c);
            else
                c = Character.toUpperCase(c);
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Lec2 T = new Lec2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
