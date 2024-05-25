package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec8 {
    public String solution(String s){
        String answer = "NO";
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec8 T = new Lec8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
