package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Lec39 {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) stack.push(c - '0');
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt+rt);
                else if(c == '-') stack.push(lt-rt);
                else if(c == '*') stack.push(lt*rt);
                else if(c == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec39 T = new Lec39();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
