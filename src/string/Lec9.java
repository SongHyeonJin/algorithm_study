package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec9 {
    public int solution(String str){
        String answer = "";
        for(char c : str.toCharArray()){
//            if(c >= 48 && c <= 57)
//                answer = answer *10 + (c-48);
            if(Character.isDigit(c)) answer += c;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) throws IOException {
        Lec9 T = new Lec9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
