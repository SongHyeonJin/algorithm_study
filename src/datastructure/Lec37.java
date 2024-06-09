package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lec37 {
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ')'){
                while (true){
                    if(stack.lastElement() == '('){
                        stack.pop();
                        break;
                    }
                    stack.pop();
                }
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        for (int i=0; i<stack.size(); i++){
            answer += stack.get(i);
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec37 T = new Lec37();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
