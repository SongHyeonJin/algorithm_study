package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec5 {
    public String solution(String str){
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if(!Character.isAlphabetic(s[lt]))
                lt++;
            else if(!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec5 T = new Lec5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
