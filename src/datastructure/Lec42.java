package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Lec42 {
    public String solution(String need, String plan){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();
        for (char c : need.toCharArray()) queue.offer(c);
        for (char c : plan.toCharArray()){
            if(queue.contains(c)){
                if(c != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Lec42 T = new Lec42();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        System.out.println(T.solution(a, b));
    }
}
