package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lec36 {
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(stack.isEmpty() && c ==')') return "NO";
            else if(c == '(') stack.push(c);
            else stack.pop();
        }
        answer = stack.isEmpty() ? "YES" : "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec36 T = new Lec36();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
