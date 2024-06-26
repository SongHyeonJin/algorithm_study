package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lec40 {
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else{
                stack.pop();
                if(str.charAt(i-1) == '(')
                    answer += stack.size();
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec40 T = new Lec40();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
