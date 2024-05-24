package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec3 {
    public String solution(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] strs = str.split(" ");
        for(String s : strs){
            int len = s.length();
            if(len > max){
                max = len;
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Lec3 T = new Lec3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
