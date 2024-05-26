package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec11 {
    public String solution(String str){
        String answer = "";
        int iterator = 1;
        answer += str.charAt(0);
        for (int i=1; i<str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                iterator++;
            }else{
                if(iterator > 1)
                    answer += iterator;
                answer += str.charAt(i);
                iterator = 1;
            }
        }
        if(iterator > 1)
            answer += iterator;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec11 T = new Lec11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
