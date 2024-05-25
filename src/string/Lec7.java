package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec7 {
    public String solution(String str){
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec7 T = new Lec7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
